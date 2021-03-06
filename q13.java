// Kadane's Algorithm 
import java.io.*;
import java.util.*;

class q13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(findLarSubSeq(a, n));
    }

    public static int findLarSubSeq(int a[], int n){
        int max = a[0];
        int curr = a[0];

        for(int i = 1; i < n; i++){
            curr = Math.max(a[i], curr + a[i]);
            max = Math.max(curr, max);
        }

        return max;
    }
}