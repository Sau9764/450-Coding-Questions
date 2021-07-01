// Union of two arrays 
import java.io.*;
import java.util.*;

class q6 {
    public static void main(String[] args) {
        
        int n = 10;
        int a[] = new int[n];
        int b[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = (int)(Math.random() * 10);
            b[i] = (int)(Math.random() * 10);
        }

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println(findUnion(a, n, b, n));
    }

    public static int findUnion(int a[], int n1, int b[], int n2){
        int p1 = 0;
        int p2 = 0;

        int counter = 0;
        int prev_ele = 0;

        while(p1 < n1 && p2 < n2){
            if(prev_ele == a[p1] || prev_ele == b[p2]){
                if(prev_ele == a[p1]) p1++;
                if(prev_ele == b[p2]) p2++;
                continue;
            }
            if(a[p1] == b[p2]){
                counter++;
                prev_ele = a[p1];
                p1++;
                p2++;
                
            } else if(a[p1] < b[p2]){
                counter++;
                prev_ele = a[p1];
                p1++;
               
            } else if(a[p1] > b[p2]){
                counter++;
                prev_ele = b[p2];
                p2++;
               
            }
        }

        if(p1 == n1){
            return counter + (n2 - p2);
        }

        if(p2 == n2){
            return counter + (n1 - p1);
        }

        return counter;
    }
}

// Another way
// HashSet <Integer> set = new HashSet<Integer>();
// for(int i = 0; i < n; i++)
// set.add(a[i]);

// for(int i = 0; i < m; i++) {

// set.add(b[i]);
// }
// return set.size();