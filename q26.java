import java.io.*;
import java.util.*;

class q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(findMaxProfilt(a, n));

    }

    public static int findMaxProfilt(int a[], int n){
        int b[] = new int[n];
        
        int max = a[n - 1];
        
        for(int i = n - 2; i >= 0; i--){
            if(a[i] > max){
                max = a[i];
            }

            b[i] = Math.max(b[i+1], max - a[i]);
        }

        int min = a[0];

        for(int i = 1; i < n; i++){
            if(a[i] < min){
                min = a[i];
            }

            b[i] = Math.max(b[i-1], b[i] + (a[i] - min));
        }

        return b[n-1];
    }
}