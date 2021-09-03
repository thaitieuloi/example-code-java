package com.ttl.maven;

import com.ttl.maven.utils.InputUtils;

public class BaiTap10 {

	/*
	 * Bài 10. Viết chương trình liệt kê tất cả các tập con k phần tử của 1, 2, ..,n
	 * (k≤n).
	 */
	
	
	public static void result(int a[], int k) {
		int i;
		System.out.println();
		for (i = 1; i <= k; i++) {
			System.out.print("  " + a[i]);
		}
	}

	public static void tryBackTrack(int a[], int n, int k, int i) {
		int j;
		for (j = a[i - 1] + 1; j <= (n - k + i); j++) {
			a[i] = j;
			if (i == k)
				result(a, k);
			else
				tryBackTrack(a, n, k, i + 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Nhap n");
		int n = InputUtils.nhap();
		int[] array = new int[n + 1];
		int k;
		
		System.out.println("Liet ke tat ca cac tap con k phan tu cua 1,2,..," + n + " : ");
		for (k = 1; k <= n; k++) {
			System.out.println("\n Tap con " + k + " phan tu: ");
			tryBackTrack(array, n, k, 1);
		}
		
	}
}
