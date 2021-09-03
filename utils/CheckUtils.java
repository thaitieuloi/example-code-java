/**
 * 
 */
package com.ttl.maven.utils;

/**
 * @author Administrator
 *
 */
public class CheckUtils {
	/**
     * check so nguyen to
     * 
     * @author loitt
     * @param n: so nguyen duong
     * @return true la so nguyen so, 
     *         false khong la so nguyen to
     */
	public static boolean isPrimeNumber(int n) {
		// so nguyen n < 2 khong phai la so nguyen to
		if (n < 2) {
			return false;
		}
		// check so nguyen to khi n >= 2
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
