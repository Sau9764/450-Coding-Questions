import java.io.*;
import java.util.*;

class q1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        // adding items
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        // normal call
        reverse_it(a, n);
        System.out.println("Itrative function - > " + Arrays.toString(a));

        // recursive call
        if(n > 1) reverse_rec(a, 0, n - 1);
        System.out.println("Recursive Function -> " + Arrays.toString(a));

    }

    public static void reverse_it(int a[], int n){
        int l = 0;
        int r = n - 1;
        int temp = 0;

        while(l < r){
            temp = a[l];
            a[l] = a[r];
            a[r] = temp;   
            l++;
            r--;
        }
    }

    public static void reverse_rec(int a[], int l, int r){
        
        if(l >= r) return;

        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;

        reverse_rec(a, l+1, r-1); // ++ are not allowed here...Because stack overflow error occure.
    }
}
