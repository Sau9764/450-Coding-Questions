// Inversion count

import java.io.*;
import java.util.*;

class q16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));

        System.out.println(mergeSort(a, 0, n - 1));
        
    }

    public static int mergeSort(int a[], int low, int high){
        
        int inv = 0;

        if(low < high){
            int mid = (low + high) / 2;

            inv += mergeSort(a, low, mid);
            
            inv += mergeSort(a, mid+1, high);
           
            inv += merge(a, low, mid, high);
            
        }

        return inv;
    }

    public static int merge(int a[], int l, int m, int r){

        
        int inv1 = 0;

        int left[] = Arrays.copyOfRange(a, l, m+1);
        int right[] = Arrays.copyOfRange(a, m+1, r+1);

        int n1 = left.length;
        int n2 = right.length;
        
        int pt = l;
        int i = 0, j = 0;

        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                a[pt++] = left[i++];
            }else{
                System.out.println(" -> a[0] " + a[l + i] + " - a[1]" + a[m + j + 1]);
                inv1 += (m + 1) - (l + i);
                
                a[pt++] = right[j++]; 
            }
        }

        while(i < n1){
            a[pt++] = left[i++];
        }

        while(j < n2){
            a[pt++] = right[j++];
        }

        return inv1;

    }
}

