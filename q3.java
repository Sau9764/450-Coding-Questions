// Kth smallest element
// O(n + klogn + hlogn)

import java.io.*;
import java.util.*;

class q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            pq.add(sc.nextInt());
        }

        // System.out.println(pq);

        int k = sc.nextInt();
        int ele = 0;

        for(int i = 0; i < k; i++){
            ele = pq.remove();
        }

        System.out.println(ele);

    }
}