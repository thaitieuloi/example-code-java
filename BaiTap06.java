package com.ttl.maven;

import com.ttl.maven.utils.CheckUtils;
import com.ttl.maven.utils.InputUtils;

public class BaiTap06 {
	
	/* Bài 6. Viết chương trình liệt kê n số nguyên tố đầu tiên. */
	
	public static void getList(int n) {
		int i = 2, count = 0;
		while (count < n) {
			if (CheckUtils.isPrimeNumber(i)) {
				System.out.print(" " + i);
				count++;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		System.out.print("Nhap n");
		int n = InputUtils.nhap();
		
		System.out.println(n + " so nguyen to dau tien la: ");
		getList(n);
	}
}
