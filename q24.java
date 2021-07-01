import java.io.*;
import java.util.*;

class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(findMaxSeq(a, n));
    }

    public static int findMaxSeq(int a[], int n){
        int max = 1;

        Arrays.sort(a);
        
        ArrayList<Integer> ar = new ArrayList<>();
        int counter = 0;
        ar.add(a[0]);
        
        for(int i = 1; i < n; i++){
            if(ar.get(counter) != a[i]){
                ar.add(a[i]);
                counter++;
            }
        }
 
        for(int i = 1; i <= counter; i++){
            int count = 1;
            while(i <= counter && ((ar.get(i - 1) + 1) == ar.get(i))){
                count++;
                i++;
            }
            max = Math.max(count, max);
        }

        return max;
    }
}