import java.io.*;
import java.util.*;

class q32 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        findSeq(arr, n, a, b);

        System.out.println(Arrays.toString(arr));
    }

    public static void findSeq(int arr[], int n, int a, int b){
        
        int posA = 0;
        int posB = n-1;

        for(int i = 0; i < n; i++){
            if(arr[i] == a){
                posA = i;
                break;
            }
        }

        for(int i = n-1; i >= 0; i--){
            if(arr[i] == b){
                posB = i;
                break;
            }
        }

        System.out.println("POS A " + posA + " - POS B " + posB);

        int i = 0;
        int j = n-1;

        while(i < posA && j > posB){
            while(i < posA && arr[i] < arr[posA]){
                i++;
            }
            while(j > posB && arr[j] > arr[posB]){
                j--;
            }
            if(i != posA && j != posB) {
                int temp = arr[posA];
                arr[posA] = arr[posB];
                arr[posB] = temp;
                i++;
                j--;
            }
        }

        System.out.println("1 - > " + Arrays.toString(arr));
        System.out.println("i " + i + " - j " + j);

        while(i < posA){
            // rotate to posa and i
            if(arr[i] > arr[posA] && arr[i] <= arr[posB]){
                rotate(arr, i, posA);
                posA--;
                i--;
            }else if(arr[i] > arr[posA] && arr[i] > arr[posB]){
                rotate(arr, i, posB);
                posA--;
                posB--;
                i--;
            }
            i++;
            System.out.println("\t\t" + Arrays.toString(arr));
        }

        System.out.println("2 - > " + Arrays.toString(arr));

        while(j > posB){
            if(arr[j] < arr[posB] && arr[j] >= arr[posA]){
                rotate(arr, posB, j);
                posB++;
                j++;
            }else if(arr[j] < arr[posB] && arr[j] < arr[posA]){
                rotate(arr, posA, j);
                posB++;
                posA++;
                j++;
            }
            j--;
            System.out.println("\t\t" + Arrays.toString(arr));
        }

        System.out.println("3 - > " +  Arrays.toString(arr));

        Arrays.sort(arr, posA, posB+1);

        
    }

    public static void rotate(int a[], int i, int j){
        int temp = a[i];
        for(int k = i+1; k <= j; k++){
            a[k-1] = a[k];
        }
        a[j] = temp;
    }

}

// 6
// 1 2
// 4 3 1 2 5 2
