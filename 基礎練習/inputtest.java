#輸入練習

package com.hw.java16;

import java.util.Scanner;

public class hey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String word = scanner.next(); //空白輸入即結束
		System.out.println(word);
		
		String wordline = scanner.nextLine(); //空白輸入不結束
		System.out.println(wordline);
		
	}

}
