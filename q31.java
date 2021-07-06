// Smallest subarray with sum greater than x

import java.io.*;
import java.util.*;

class q31 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println(sb(a, n, x));
    }

    public static int sb(int a[], int n, int x) {
        
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;

        for(j = 0; j < n && sum < x; j++){
            sum += a[j];
        }

        // System.out.println("--> " + j);

        count = j;
        int min = n+1;

        // System.out.println("--> " + count);

        System.out.println(" - > " + i + " - > " + j + " - > " + count);

        while(j < n || i < n){

            while(sum-a[i] > x){
                sum -= a[i];
                i++;
                count--;
            }

            if(j >= n - 1 && count >= min){
                break;
            }

            System.out.println(" - > " + i + " - > " + j);

            if(sum > x) min = Math.min(min, count);

            if(i != n - 1 && sum != 0){
                sum -= a[i];
                i++;
                count--;
            }

            while(j < n && sum < x){
                sum += a[j];
                j++;
                count++;
            }
        }

        return min;
    }

    public static int smallestSubWithSum(int arr[], int n, int x)
    {
        // Initialize current sum and minimum length
        int curr_sum = 0, min_len = n + 1;

        // Initialize starting and ending indexes
        int start = 0, end = 0;
        while (end < n) {
            // Keep adding array elements while current sum
            // is smaller than or equal to x
            while (curr_sum <= x && end < n)
                curr_sum += arr[end++];

            // If current sum becomes greater than x.
            while (curr_sum > x && start < n) {
                // Update minimum length if needed
                if (end - start < min_len)
                    min_len = end - start;

                // remove starting elements
                curr_sum -= arr[start++];
            }
        }
        return min_len;
    }
}

// 6 51
// 1 4 45 6 0 19

// 5 9
// 1 10 5 2 7

// 8 16
// 6 3 4 5 4 3 7 9
//  op - 3