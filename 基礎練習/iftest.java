package com.hw.java16;

import java.util.Scanner;

public class iftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		System.out.printf("¤À¼Æ¬O%d\n", score);
		
		if (score >= 60)
		{
			System.out.println("Pass");
		}
		else if (score >= 40)
		{
			System.out.println("Normal");
		}
		else
		{
			System.out.println("End");
		}
	}

}
