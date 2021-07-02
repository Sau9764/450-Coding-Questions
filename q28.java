import java.io.*;
import java.util.*;

class q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(find3Numbers(a, n, k));
    }

    public static boolean find3Numbers(int a[], int n, int k){
        
        Arrays.sort(a);

        HashMap<Integer, String> hs = new HashMap<>();

        for(int i = 0; i < n-1; i++){
            if(a[i] > k) break;
            for(int j = i+1; j < n; j++){
                if(a[i] + a[j] < k){
                    hs.put(a[i] + a[j], i + "-" + j);
                }else{
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(a) + "\n\n");

        System.out.println(hs);


        for(int i = 0; i < n && a[i] < k; i++){
            if(hs.containsKey(k - a[i])){
                String val = hs.get(k-a[i]);
                int b[] = new int[2];
                int pt = 0;
                for(String ele : val.split("-")){
                    b[pt++] = Integer.parseInt(ele);
                }

                if(b[0] != i && b[1] != i){
                    System.out.println("--> " + a[i]);
                    return true;
                }
            }
        }

        



        return false;
    }
}