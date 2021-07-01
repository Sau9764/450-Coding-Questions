import java.io.*;
import java.util.*;

class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }

        mergeTwoArraySol2(a, b, n, m);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static void mergeTwoArraySol2(int arr1[], int arr2[], int n, int m){
        int j = 0, i = n-1;
        while(j < m && i > -1 && arr2[j] < arr1[i]){
            int temp = arr2[j];
            arr2[j] = arr1[i];
            arr1[i] = temp;
            i--;
            j++;
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void mergeTwoArray(int a[], int b[], int n, int m){

        while(!isInSeq(a, b, n, m)){
            
            int i = n - 1;
            int j = m - 1;
            int lgt = n - 1;

            while(j >= 0){
                if(a[i] <= b[j]){
                    j--;
                }else{
                    int temp = b[j];
                    b[j] = a[lgt];
                    a[lgt] = temp;

                    if(lgt != 0 && a[lgt] < a[lgt - 1]){
                        lgt--;
                    } 
                    j--;
                }
            }

            Arrays.sort(a);

            System.out.println("-----> \t" + Arrays.toString(a));
            System.out.println("-----> \t" + Arrays.toString(b));

        }

        Arrays.sort(b);
    }

    public static boolean isInSeq(int a[], int b[], int n, int m){
        int amax = a[n - 1];

        for(int i = 0; i < m; i++){
            if(amax > b[i]) return false;
        }

        return true;
    }
}

// 10 10
// 7 9 9 10 11 11 13 14 17 19
// 1 1 4 5 8 11 13 16 19 19