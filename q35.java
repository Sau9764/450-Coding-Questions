// Median of two sorted arrays of same size
// https://www.geeksforgeeks.org/median-of-two-sorted-arrays/

import java.io.*;
import java.util.*;

class q35 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			b[i] = sc.nextInt();
		}

		System.out.println(medianSame(a, b, n));
	}

	public static int medianSame(int a[], int b[], int n){
		
		if(n == 2){
			int maxa = Math.max(a[0], b[0]);
			int maxb = Math.min(a[1], b[1]);

			return (int) (maxa + maxb) / 2;
		}

		if(n == 1){
			return (a[0] + b[0]) / 2;
		}

		int m1 = median(a, n);
		int m2 = median(b, n);

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		System.out.println("Medians " + m1 + " " + m2);

		int mid = n / 2;

		System.out.println(mid+1);

		System.out.println("\n-------------------------");

		if(m1 == m2){
			return m1;
		}else if(m1 < m2){
			return medianSame(Arrays.copyOfRange(a, mid, n), Arrays.copyOfRange(b, 0, mid+1), mid+1);
		}else{
			return medianSame(Arrays.copyOfRange(a, 0, mid+1), Arrays.copyOfRange(b, mid, n), mid+1);
		}


	}

	public static int median(int a[], int n){
		if(n % 2 == 1){
			return a[(int) n / 2];
		}else{
			return  (int) (a[(int) n / 2] + a[(int) n / 2 - 1]) / 2;
		}
	}
}


// 5
// 1 12 15 26 38
// 2 13 17 30 45