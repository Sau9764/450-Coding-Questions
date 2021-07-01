// Minimize the Heights II 

import java.io.*;
import java.util.*;

class q9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int a[] = new int[n];

        int k = sc.nextInt();

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(findMinDiff(a, n, k));
    }

    public static int gfgSolutions(int arr[], int n. int k){
       
        Arrays.sort(arr);
       
        int minEle, maxEle;
        int result = arr[n-1] - arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] >= k){
                maxEle = Math.max(arr[i-1] + k, arr[n-1]-k);
                minEle = Math.min(arr[0]+k, arr[i]-k);
                result = Math.min(result, maxEle-minEle);
            }
        }

        return result;
    }

    public static int findMinDiff(int a[], int n, int k){
        
        Arrays.sort(a);

        System.out.println("Sorted -> " + Arrays.toString(a));

        // make all
        int gret = 0; // decide smaller values
        int minest = a[n - 1] - a[0]; // final return

        // itration 1
        for(int i = 0; i < n; i++){
           if(a[i] <= k) {
                a[i] += k;
                gret = i;
           }else a[i] -= k;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            min = Math.min(a[i], min);
            max = Math.max(a[i], max);
        }

        minest = Math.min(minest, max - min);

        System.out.println("A -> " + Arrays.toString(a) + " " + min + " " + max + " " + minest);

        // itration next
        int b[] = Arrays.copyOf(a, n);
            
        for(int i = gret + 1; i < n; i++){
            b[i] = b[i] + (2 * k);
            
            int max1 = Integer.MIN_VALUE;
            int min1 = Integer.MAX_VALUE;

            for(int j = 0; j < n; j++){
                min1 = Math.min(b[j], min1);
                max1 = Math.max(b[j], max1);
            }
            minest = Math.min(minest, max1 - min1);
            
            System.out.println("B -> " + Arrays.toString(b) + " " + min1 + " " + max1 + " " + minest);

            // b[i] = b[i] - (2 * k);
        }

        return minest;
    }
}