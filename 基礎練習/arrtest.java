package com.hw.java16;

import java.util.Scanner;

public class arrtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[7]; //int[]��int�}�C���A //��7���x�s�Ŷ� //�i��}�C�令���P�榡 ex. double, string, boolean...
		
		for(int i = 0; i <= 6; i++)
		{
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			x[i] = num;
		}
		
		System.out.println(x[3]); //�����w�Ʀr���Ů�_�l�Ȭ�0
		System.out.println(x.length); //�o�}�C����(�x�s�Ŷ�)
	}

}
