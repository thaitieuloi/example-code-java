package com.ttl.maven;

import com.ttl.maven.utils.InputUtils;

public class BaiTap03 {

	/*
	 * Bài 3. Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
	 * Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.
	 */

	/**
	 * get Sum
	 * @param i
	 * @return
	 */
	public static int getSum(long i) {
		int sum = 0;
		long n;
		while (i != 0) {
			n = i % 10;
			sum += n;
			i /= 10;
		}
		return (sum);
	}

	public static void main(String[] args) {
		System.out.print("Nhap n");
		int n = InputUtils.nhap();

		int s = getSum(n);
		System.out.println("Tong cua so " + n + " = " + s);
	}
}
