import java.io.*;
import java.util.*;

class q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long a[] = new long[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextLong();

        int m = sc.nextInt();
        long b[] = new long[m];

        for(int i = 0; i < m; i++) b[i] = sc.nextLong();

        System.out.println(isSubset(a, b, n, m));

    }

    public static String isSubset( long a[], long b[], long n, long m) {
        if(m > n) return "No";
        
        HashMap<Long, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(hm.containsKey(a[i])){
                int val = hm.get(a[i]);
                hm.remove(a[i]);
                hm.put(a[i], val+1);
            }else{
                hm.put(a[i], 1);
            }
        }

        for(int i = 0; i < m; i++){
            if(hm.containsKey(b[i])){
                int val = hm.get(b[i]);
                hm.remove(b[i]);
                if(val > 1)
                    hm.put(a[i], val-1);
            }else{
                return "No";
            }
        }

        return "Yes";
        
    }
}

// 6
// 11 1 13 21 3 7
// 4
// 11 3 7 1