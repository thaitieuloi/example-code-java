package com.ttl.maven;

import com.ttl.maven.utils.InputUtils;

public class BaiTap01 {

	/*
	 * Bài 1. Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của
	 * hai số tự nhiên a và b.
	 */
	
	
	/**
	 * UCLN
	 * @param a {@link int}
	 * @param b {@link int}
	 * @return
	 */
	public static int UCLN(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return (a);
	}

	public static void main(String[] args) {
		// Input a
		System.out.println("Nhap a");
		int a = InputUtils.nhap();

		// Input b
		System.out.println("Nhap b");
		int b = InputUtils.nhap();

		int ucln = UCLN(a, b);
		int bcnn = ((a * b) / UCLN(a, b));
		System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + ucln);
		System.out.println("Boi chung nho nhat cua " + a + " va " + b + " la: " + bcnn);

	}
}
