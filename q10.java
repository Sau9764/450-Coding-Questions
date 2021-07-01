//  Minimum number of jumps 

import java.io.*;
import java.util.*;

class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));

        // System.out.println(findMinJump(a, n));
        System.out.println(copyedSolution(a, n));
    }

    public static int copyedSolution(int arr[], int n){
        int jumps = 0, farthest = 0, currEnd = 0;
        for(int i=0;i<n-1;i++)
        {
            // index
            System.out.println("-> [" + i + "]");

            farthest = Math.max(farthest, i + arr[i]);
            System.out.println("\t" + farthest);

            if(farthest >= n-1){
                System.out.println("\t" + "Exit with farthest >= n");
                return 1 + jumps;
            }
                
            
            if(i == farthest){
                System.out.println("\t" + "Encounter 0");
                return -1;
            }
                
            
            if(i == currEnd)
            {
                jumps++;
                currEnd = farthest;
                System.out.println("\t\t" + "<<" + jumps + ">>" + " " + currEnd);
            }
        }
        return jumps;
    }

    public static int findMinJump(int a[], int n){
        int jump = 1;
        int i = 0;

        System.out.println(" [" + i + "]-> " + a[i]);

        while(i < n){
            int j = a[i];
            int max = 0; 
            int maxI = 0;
            int k = 0;

            if(i+j+1 >= n) return jump;

            for(k = i+1; k < (i + 1 + j); k++){
                if(k >= n) return jump++;
                if(max < (a[k]+(k - i))){
                    maxI = k;
                    max = a[k];
                    System.out.println("<<" + k  + ">>");
                }
            }

            if(a[maxI] == 0) return -1;

            i = maxI;
            jump++;

            System.out.println("-> [" + i + "]-> " + ((i < n) ? a[i] : "end"));
        }

        return jump;
    }
}

// 11
// 0 1 2 3 4 5 6 7 8 9 10
// 1 3 5 8 9 2 6 7 6 8 9
// Ans 3

// N = 6
// arr = 1 4 3 2 6 7
// Output: 2 

// 10
// 2 3 1 1 2 4 2 0 1 1
// Ans 4

// 29
// 10 8 12 17 1 21 5 17 20 11 5 27 23 8 12 18 16 12 9 8 17 12 23 26 0 5 9 24 10
// Ans 2

// 8, 12, 17, 1, 21, 5, 17, 20, 11, 5
// 8  13  19  4  25  10 23  27  19  14