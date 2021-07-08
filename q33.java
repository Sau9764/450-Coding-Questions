import java.io.*;
import java.util.*;

class q33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int k = sc.nextInt();

		int a[] = new int[n];

		for(int i = 0; i < n; i++) a[i] = sc.nextInt();

		// System.out.println(findMinSwap(a, n, k));

		System.out.println(method2(a, n, k));

	}

	public static int findMinSwap(int a[], int n, int k){
		
		int maxSeq = 0;
		int cnt = 0;
		int curr = 0;

		for(int i = 0; i < n; i++){
			if(a[i] <= k){
				cnt++;
				curr++;
				maxSeq = Math.max(curr, maxSeq);
			}else{
				curr = 0;
			}
		}

		return cnt - maxSeq;
	}

	public static int method2(int a[], int n, int k){
		int cnt = 0;
		for(int i = 0; i < n; i++){
			if(a[i] <= k){
				cnt++;
			}
		}

		System.out.println("cnt -> "  + cnt);
		
		int have = 0;

		for(int i = 0; i < cnt; i++){
			if(a[i] > k){
				have++;
			}
		}

		System.out.println("have -> "  + have);

		int j = 1;
		int min = have;

		for(int i = cnt; i < n; i++, j++){
			if(a[i] > k){
				have++;
			}
			if(a[j-1] > k){
				have--;
			}

			for(int i1 = j; i1 <= i; i1++) {
				if(a[i1] > k)
					System.out.print("[" + a[i1] + "] ");
				else
					System.out.print(a[i1] + " ");
			}

			System.out.println("\t have - > " + have);

			min = Math.min(have, min);
		}

		return min;
	}
}

// 5 3
// 2 1 5 6 3
// op 1

// 7 6
// 2 7 9 5 8 7 4
// op 2

// 20 14
// 4 11 6 5 11 20 19 14 14 2 9 20 11 11 15 1 7 12 19 9
// 4

// 11 9
// 8 13 7 6 4 8 5 15 11 13 18
// 1