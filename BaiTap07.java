package com.ttl.maven;

import com.ttl.maven.utils.InputUtils;

public class BaiTap07 {

	/*
	 * Bài 7. Dãy số Fibonacci được định nghĩa như sau: F0 =1, F1 = 1; Fn = Fn-1 +
	 * Fn-2 với n>=2. Hãy viết chương trình tìm số Fibonacci thứ n.
	 */

	public static void main(String[] args) {
		System.out.print("Nhap n");
		int n = InputUtils.nhap();

		int[] f = new int[n + 1];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}

		System.out.println("So Fibonanci thu " + n + " la: f[" + n + "]= " + f[n]);
	}

}
