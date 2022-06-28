#while練習

package com.hw.java16;

import java.util.Scanner;

public class whiletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int result = 0;
		int i = 1;
		
		while(i <= n)
		{
			result += i;
			i++;
		}
		
		System.out.println(result);
	}

}
