package com.ttl.maven;

import com.ttl.maven.utils.InputUtils;

public class BaiTap02 {
	
	/*
	 * Bài 2: Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở
	 * hệ cơ số b bất kì (1< b≤ 36)
	 */
	
	
	/**
	 * change Base Number
	 * @param n
	 * @param base
	 */
	public static void changeBaseNumber(int n, int base) {
		if (n >= base)
			changeBaseNumber(n / base, base);
		if (n % base > 9)
			System.out.printf("%c", n % base + 55);
		else
			System.out.print((n % base));
	}


	public static void main(String[] args) {

		System.out.println("Nhap n");
		int n = InputUtils.nhap();

		System.out.println("Nhap vao co so can chuyen sang b");
		int b = InputUtils.nhap();

		System.out.println("So " + n + " chuyen sang co so " + b + " thanh: ");
		changeBaseNumber(n, b);
	}
}
