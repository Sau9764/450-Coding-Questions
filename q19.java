// Common elements in 3 sorted array
import java.io.*;
import java.util.*;

class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        for(int i = 0; i < n1; i++) a[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int b[] = new int[n2];
        for(int i = 0; i < n2; i++) b[i] = sc.nextInt();

        int n3 = sc.nextInt();
        int c[] = new int[n3];
        for(int i = 0; i < n3; i++) c[i] = sc.nextInt();

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        System.out.println(findCommon(a, b, c, n1, n2, n3));

    }

    public static ArrayList<Integer> findCommon(int a[], int b[], int c[], int n1, int n2, int n3){

        ArrayList<Integer> ar = new ArrayList<Integer>();
 
        int k = 0, l = 0, m = 0;
        int i = 0;

        while(k < n1 && l < n2 && m < n3){
            if(a[k] == b[l] && b[l] == c[m]){
                if(ar.indexOf(a[k]) == -1){
                    ar.add(a[k]);
                }
                k++;
                l++;
                m++;
            }else if(a[k] == b[l] && a[k] > c[m]){
                m++;
            }else if(a[k] == b[l] && a[k] < c[m]){
                k++;
                l++;
            }else if(a[k] == c[m] && a[k] > b[l]){
                l++;
            }else if(a[k] == c[m] && a[k] < b[l]){
                k++;
                m++;
            }else if(b[l] == c[m] && b[l] > a[k]){
                k++;
            }else if(b[l] == c[m] && b[l] < a[k]){
                l++;
                m++;
            }else {
                if(a[k] > b[l] && a[k] > c[m]){
                   l++;
                   m++;
                }else if(b[l] > a[k] && b[l] > c[m]){
                    k++;
                    m++;
                }else if(c[m] > a[k] && c[m] > b[l]){
                    k++;
                    l++;
                }
            }
        }

        return ar;
        
    }


}