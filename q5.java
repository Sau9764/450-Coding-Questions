import java.io.*;
import java.util.*;

class q5 {
    public static void main(String[] args) {
        int n = 10;

        int neg = (int) (Math.random() * 10);
        
        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = (int) (Math.random() * 10);
        }

        for(int i = 0; i < neg; i++){
            a[(int) (Math.random() * 10)] *= -1;
        }

        System.out.println(Arrays.toString(a));

        int pos = n - 1;
        neg = 0;

        while(neg < pos){
            while(neg < pos && a[neg] < 0) neg++;
            while(neg < pos && a[pos] >= 0) pos--;

            swap(a, pos, neg);

        }

        System.out.println(Arrays.toString(a));

    }

    public static void swap(int a[], int l, int r){
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

}