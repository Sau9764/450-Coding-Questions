import java.io.*;
import java.util.*;

class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        nextPermute(a);

        System.out.println(Arrays.toString(a));
    }

    public static void nextPermute(int a[]){
        
        int n = a.length;
        int i = 0;
        int max = n - 1;

        for(i = n - 1; i > 0; i--){     // Go reverse

            if(a[i] > a[i - 1]){        // Encounter i that greater than i-1
                int k = i+1;
                max = i-1;

                while(k < n){           // Finding i-1's next greater element
                    if(a[max] < a[k]) k++;
                    else break;
                }

                k--;                    

                int temp = a[max];      // Swapping i-1 ith its next greater value
                a[max] = a[k];
                a[k] = temp;

                Arrays.sort(a, i, n);   // Sort the remaining part

                return;
            }
        }

        Arrays.sort(a);                 // if desending order sequence

    }
}