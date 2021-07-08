// Find minimum number of merge operations to make an array palindrome
// https://www.geeksforgeeks.org/find-minimum-number-of-merge-operations-to-make-an-array-palindrome/

import java.io.*;
import java.util.*;

class q34 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i = 0; i < n; i++) a[i] = sc.nextInt();

		System.out.println(mergePali(a, n));
	}

	public static int mergePali(int a[], int n){
		int i = 0;
		int j = n - 1;
		int merge = 0;

		ArrayList<Integer> ar = new ArrayList<>();

		while(i < j){
			if(a[i] == a[j]){
				ar.add(a[i]);
				i++;
				j--;
			}else if(a[i] < a[j]){
				a[i+1] += a[i];
				i++;
				merge++;
			}else{
				a[j-1] += a[j];
				j--;
				merge++;
			}
		}

		ar.add(a[i]);

		for(int k = ar.size() - 2; k >= 0; k--){
			ar.add(ar.get(k));
		}

		System.out.println(ar);

		return merge;
	}
}