import java.io.*;
import java.util.*;

class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(findLarCnt(a, k, n));
    }

    public static ArrayList<Integer> findLarCnt(int a[], int k, int n){
        Arrays.sort(a);

        k = (int) n / k;

        ArrayList<Integer> ar = new ArrayList<>();

        if(n < k){
            return ar;
        }else if(n == k){
            if(a[0] == a[n-1]){
                ar.add(a[0]);
                return ar;
            }else{
                return ar;
            }
        }

        for(int i = 0; i < n - k; i++){
            if(a[i] == a[i + k] && !ar.contains(a[i])){
                ar.add(a[i]);
            }
        }

        return ar;
    } 
}