import java.io.*;
import java.util.*;

class q30 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = sc.nextInt();

        ArrayList<Long> ar = new ArrayList<>(n);

        for(int i = 0; i < n; i++) ar.add(sc.nextLong());



        System.out.println(findMinDiff(ar, n, m));


    }

    public static long findMinDiff(ArrayList<Long> ar, int n, int m){
        
        Collections.sort(ar);
        long min = Long.MAX_VALUE;
        for(int i = 0; i < n - m+1; i++){
            min = Math.min(ar.get(i+(int)m-1) - ar.get(i), min);
        }

        // System.out.println(ar);

        return min;

    }
}