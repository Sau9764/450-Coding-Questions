import java.io.*;
import java.util.*;

class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println(findLargestMul(a, n));
    }

    public static long findLargestMul(int a[], int n){
        long max = 1;
        long min = 1;
        long curr = 1;

        for(int i = 0; i < n; i++){
            if(a[i] > 0){
                curr = curr * a[i];
                min = Math.min(min * a[i], 1);
            }else if(a[i] < 0){
                long temp = curr;
                curr = Math.max(min * a[i], 1);
                min = a[i] * temp;
            }else{
                curr = 1;
                min = 1;
            }
            if(max < curr) max = curr;
        }
        return max;
    }
}