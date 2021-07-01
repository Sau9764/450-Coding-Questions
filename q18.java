// Count pairs with given sum
import java.io.*;
import java.util.*;

class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(countSumK(a, n, k));

    }

    public static int countSumK(int a[], int n, int k){
        if(n < 2) return 0;
        int count = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(hs.containsKey(k - a[i])){
                count += hs.get(k - a[i]);
            }
            if(hs.containsKey(a[i])){
                int val = hs.get(a[i]);
                hs.put(a[i], val+1);
            }else{
                hs.put(a[i], 1);
            }
        }

        return count;

    }
}