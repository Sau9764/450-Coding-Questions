// Median of two sorted arrays of different sizes
// https://www.geeksforgeeks.org/median-of-two-sorted-arrays-of-different-sizes/

import java.io.*;
import java.util.*;

class q36 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();

		int a[] = new int[n1];
		
		for(int i = 0; i < n1; i++){
			a[i] = sc.nextInt();
		}

		int n2 = sc.nextInt();
		
		int b[] = new int[n2];


		for(int i = 0; i < n2; i++){
			b[i] = sc.nextInt();
		}

		System.out.println(medianDiff(a, b, n1, n2));
		
	}

	public static int medianDiff(int a[], int b[], int n1, int n2){
		if(n1 > n2) return medianDiff(b, a, n2, n1);

		int low = 0;
		int high = n1;

		while(low <= high){
			int cut1 = (low + high) >> 1;
			int cut2 = ((n1 + n2 + 1) >> 1) - cut1;

			int left1 = cut1 == 0 ? Integer.MIN_VALUE : a[cut1-1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : b[cut2-1]; 

            int right1 = cut1 == n1 ? Integer.MAX_VALUE : a[cut1];
            int right2 = cut2 == n2 ? Integer.MAX_VALUE : b[cut2]; 

            if(left1 <= right2 && left2 <= right1) {
                if((n1 + n2) % 2 == 0 ) 
                    return (int) (Math.max(left1, left2) + Math.min(right1, right2)) / 2; 
                else 
                    return Math.max(left1, left2); 
            }
            else if(left1 > right2) {
                high = cut1 - 1; 
            }
            else {
                low = cut1 + 1; 
            }
		}

		return 0;
	}
}