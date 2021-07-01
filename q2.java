// Maximum and minimum of an array using minimum number of comparisons

import java.io.*;
import java.util.*;

class q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        // Method used (Compare the pairs)
        // Time complaxity :- 3n/2 .. - for every 2 elements 3 comparisons happens.
        
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        if(n > 0){
            if(n == 1){
                min = a[0];
                max = a[0];
            }else if(n == 2){
                if(a[0] < a[1]){
                    min = a[0];
                    max = a[1];
                }else{
                    min = a[1];
                    max = a[0];
                }
            }else{
                min = a[0];
                max = a[0];

                for(int i = 1; i < n - 1;){
                    if(a[i] < a[i + 1]){
                        if(a[i] < min){
                            min = a[i];
                        }
                        if(a[i + 1] > max){
                            max = a[i + 1];
                        }
                    }
                    i+=2;
                }
            }

            
        }

        System.out.println("Min and Max is = " + min + " " + max);
        
    }
}