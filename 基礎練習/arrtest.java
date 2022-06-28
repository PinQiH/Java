#陣列練習

package com.hw.java16;

import java.util.Scanner;

public class arrtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[7]; //int[]為int陣列型態 //有7個儲存空間 //可把陣列改成不同格式 ex. double, string, boolean...
		
		for(int i = 0; i <= 6; i++)
		{
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			x[i] = num;
		}
		
		System.out.println(x[3]); //未指定數字的空格起始值為0
		System.out.println(x.length); //得陣列長度(儲存空間)
	}

}
