/**
 * 
 */
package com.ttl.maven.utils;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class InputUtils {
	public static int nhap() {
		Scanner input = new Scanner(System.in);
		boolean check = false;
		int n = 0;
		while (!check) {
			System.out.print(" ");
			try {
				n = input.nextInt();
				check = true;
			} catch (Exception e) {
				System.out.println("Ban phai nhap so! hay nhap lai...");
				input.nextLine();
			}
		}
		return (n);
	}
}
