import java.io.*;
import java.util.*;

class q4 {
    public static void main(String[] args) {
       
        int n = 10;

        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 10) % 3;
        }

        System.out.println(Arrays.toString(a));

        // sorting 0,1,2 funtion

        int l = 0, m = 0, r = n-1;

        while(m <= r){
            switch(a[m]){
                case 0: swap(a, l, m); l++; m++; break;
                case 1: m++; break;
                case 2: swap(a, m, r); r--;
            }
        }

        System.out.println(Arrays.toString(a));

    }

    public static void swap(int a[], int l, int r){
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }
}