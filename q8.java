// Kadane's Algorithm
import java.io.*;
import java.util.*;

class q8 {
    public static void main(String[] args) {
        int n = 5;
        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(a));

        int curr_max = a[0];
        int max_so_far = a[0];

        for(int i = 1; i < n; i++){
            curr_max = Math.max(a[i], curr_max + a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }

        System.out.println(max_so_far)

    }
}