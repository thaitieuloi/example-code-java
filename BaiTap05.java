package com.ttl.maven;

import com.ttl.maven.utils.CheckUtils;
import com.ttl.maven.utils.InputUtils;

public class BaiTap05 {
	
	/*
	 * Bài 5. Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.
	 */
	
	public static void getList(int n) {
		System.out.print(" 2");
		for (int i = 3; i < n; i += 2) {
			if (CheckUtils.isPrimeNumber(i))
				System.out.print(" " + i);
		}
	}


	public static void main(String[] args) {
		System.out.print("Nhap n");
		int n = InputUtils.nhap();
		
		System.out.println("Cac so nguyen to nho hon " + n + " ");
		getList(n);
	}
}
