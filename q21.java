// Subarray with 0 sum
import java.io.*;
import java.util.*;

class q20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println(Arrays.toString(a));

        System.out.println(isSumZero(a, n));
    }

    public static String isSumZero(int a[], int n){
        
        if(n == 0) return false;
        else if(n == 1 && a[0] != 0) return false;
        else if(n == 1 && a[0] == 0) return true;
        else {
            
            int sum = a[0];
            HashSet<Integer> hs = new HashSet<>();
            hs.add(a[0]);
            
            for(int i = 1; i < n; i++){
                sum += a[i];
                if(hs.contains(sum) || sum == 0){
                    return true;
                }else{
                    hs.add(sum);
                }
            }
            
            return false;
        }

    }

}