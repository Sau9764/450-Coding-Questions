import java.io.*;
import java.util.*;

class q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println(findDropWater(a, n));

    }

    public static int findDropWater(int a[] , int n){
        int maxr = -1;
        
        for(int i = 1; i < n; i++){
            if(maxr < a[i]) maxr = a[i];
        }

        int left[] = new int[n];
        int right[] = new int[n];

        int maxl = a[0];
        
        left[0] = -1;
        left[n-1] = -1;
        right[0] = -1;
        right[n-1] = -1;

        for(int i = 1; i < n-1; i++){
            if(a[i] > maxl){
                maxl = a[i];
            }
            left[i] = maxl;
            
            if(a[i] == maxr){
                int j = i+1;
                maxr = -1;
                while(j < n){
                    maxr = Math.max(maxr, a[j]);
                    j++;
                }
            }
            right[i] = maxr;
        }

        int water = 0;

        for(int i = 1; i < n-1; i++){
            int min = Math.min(left[i], right[i]);
            if(a[i] < min) {
                water += (min - a[i]);
            }
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        return water;

    }
}