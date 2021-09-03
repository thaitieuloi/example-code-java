package com.ttl.maven;

public class BaiTap08 {
	
	/*
	 * Bài 8. Một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải
	 * hay từ phải sang trái số đó ta vẫn nhận được một số giống nhau. Hãy liệt kê
	 * tất cả các số thuận nghịch độc có sáu chữ số (Ví dụ số: 558855).
	 */
	
	public static boolean testReverse(int n) {
		StringBuilder xau = new StringBuilder();
		String str = String.valueOf(n);
		xau.append(str);
		String check = "" + xau.reverse();
		if (str.equals(check))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int n, count = 0;
		
		for (n = 100000; n <= 999999; n++) {
			if (testReverse(n)) {
				System.out.println(n);
				count++;
			}
		}
		
		System.out.println("Co " + count + " so thuan nghich co 6 chu so");
	}
}
