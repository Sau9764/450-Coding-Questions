// Cyclically rotate an array by one 

import java.io.*;
import java.util.*;

class q7 {
    public static void main(String[] args) {
        int n = 10;
        int a[] = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = (int) (Math.random() * 10);
        
        System.out.println(Arrays.toString(a));

        rotateByOne(a, n);

        System.out.println(Arrays.toString(a));
    }

    public static void rotateByOne(int a[], int n){

        int temp = arr[n - 1];

        for(int i = n - 1; i >= 0; i--){
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }
}