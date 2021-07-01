// Best Time to Buy and Sell Stock
import java.io.*;
import java.util.*;

class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int a[]){
        int min = Integer.MAX_VALUE;
        int max = 0;
        int n = a.length;

        for(int i = 0; i < n; i++){
            if(a[i] < min){
                min = a[i];
            }else{
                if(a[i] - min > max) {
                    max = a[i] - min;
                }
            }
        }

        return max;
    }
}

// 6
// 7 1 5 3 6 4