package com.ttl.maven;

import com.ttl.maven.utils.InputUtils;

public class BaiTap09 {

	/* Bài 9. Viết chương trình liệt kê tất cả các xâu nhị phân độ dài n. */

	public static void getList(int n) {
		int[] array = new int[n];
		int tich;
		do {
			tich = 1;
			// In ra mang va tinh tich cac phan tu trong mang
			System.out.println("");
			for (int j = 0; j < n; j++) {
				System.out.print(" " + array[j]);
				tich *= array[j];
			}
			
			int i = n - 1;
			
			do {
				if (array[i] == 0) {
					array[i] = 1;
					for (int j = n - 1; j > i; j--) {
						array[j] = 0;
					}
					break;
				} else
					i--;
			} while (i >= 0);
		} while (tich != 1);
	}
	
	public static void main(String[] args) {
		System.out.println("Nhap n");
		int n = InputUtils.nhap();
		
		getList(n);
	}
}
