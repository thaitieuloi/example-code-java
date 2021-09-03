package com.ttl.maven;

import java.util.ArrayList;
import java.util.List;

import com.ttl.maven.utils.CheckUtils;
import com.ttl.maven.utils.InputUtils;

public class BaiTap04 {
	
	/*
	 * Bài 4. Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố.
	 * Ví dụ: Số 28 được phân tích thành 2 x 2 x 7
	 */
	
	
	public static List<String> getSNTWithCondition(int n) {
		int i = 2;
		List<String> result = new ArrayList<>();
		while (n > 1) {
			if (CheckUtils.isPrimeNumber(i)) {
				if (n % i == 0) {
					result.add(String.valueOf(i));
					n /= i;
				} else
					i++;
			} else
				i++;
		}
		
		return result;
	}


	public static void main(String[] args) {
		System.out.print("Nhap n");
		int n = InputUtils.nhap();
		
		System.out.print("n = ");
		List<String> result = getSNTWithCondition(n);
		
		String value = String.join("*", result);
		System.out.println(value);
	}
}
