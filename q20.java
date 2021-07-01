// Rearrange array in alternating positive & negative items with O(1) extra space

import java.io.*;
import java.util.*;

class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println(Arrays.toString(a));

        rearrange(a, n);

        System.out.println(Arrays.toString(a));


    }

    public static void rearrange(int a[], int n){

        int pos = 0;
        int neg = 0;

        for(int i = 0; i < n; i++){
            if((a[i] >= 0 && i % 2 == 0) || (a[i] < 0 && i % 2 == 1)){
                continue;
            }else{
                pos = i;
                while(pos < n && a[pos] < 0){
                    pos++;
                }
                neg = i;
                while(neg < n && a[neg] >= 0){
                    neg++;
                }
                if(pos < n && neg < n)
                    rotate(a, pos, neg);
            }
        }
    }

    public static void rotate(int a[], int i, int j){

        // System.out.println("---> " + i + " " + j);
        
        if(i > j){
            int temp = i;
            i = j;
            j = temp;
        }

        int temp = a[j];
        for(int i1 = j; i1 > i; i1--){
            a[i1] = a[i1 - 1];
        }
        a[i] = temp;

        // System.out.println("\t\t" + Arrays.toString(a));

    }

    

}