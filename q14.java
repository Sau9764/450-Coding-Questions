import java.io.*;
import java.util.*;

class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[][] = new int[n][2];

        for(int i = 0; i < n; i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        System.out.println(Arrays.deepToString(a));

        System.out.println(Arrays.deepToString(MergeIntervels(a)));

    }

    public static int[][] MergeIntervels(int a[][]){

        // Arrays.sort(a, new Comparator<int[]>() {
        //     public int compare(int[] a, int[] b) {
        //         return a[0] - b[0];
        //     }
        // });

        // Lambda
        Arrays.sort(a, (ar1, ar2) -> ar1[0] - ar2[0]);

        System.out.println("After Soring " + Arrays.deepToString(a));


        int l = a[0][0];
        int r = a[0][1];
        int n = a.length;
        int cnt = 0;

        int b[][] = new int[n][2];

        int k = a[0][1];

        for(int i = 1; i < n; i++){
            if(a[i][0] <= k){
                k = Math.max(k, a[i][1]);
            }else{
                push(b, l, k, cnt);
                cnt++;
                k = a[i][1];
                l = a[i][0];
            }
        }

        push(b, l, k, cnt);

        return Arrays.copyOf(b, cnt+1);


    }

    public static void push(int b[][], int l, int r, int cnt){
        b[cnt][0] = l;
        b[cnt][1] = r;
    }
}