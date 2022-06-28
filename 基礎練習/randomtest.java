package com.hw.java16;

import java.util.Scanner;

public class randomtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = (int)Math.random(); //隨機取0~1的數
		number *= 1000; //將隨機範圍放大1000
		
		Scanner scanner = new Scanner(System.in);
		
		int guess = -1;
		
		while (guess != number)
		{
			guess = scanner.nextInt();
			
			if (guess > number)
			{
				System.out.println("too large!");
			}
			else if (guess < number)
			{
				System.out.println("too small!");
			}
			else
			{
				System.out.println("right!");
			}
		}
		
	}

}
