#switch練習

package com.hw.java16;

import java.util.Scanner;

public class switchtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		
		switch(day)
		{
			case 1:
				System.out.println("wear new clothes");
				break;
				
			case 2:
				System.out.println("hungry");
				break;
				
			case 3:
				System.out.println("climb mountain");
				break;
				
			case 4:
				System.out.println("watch TV");
				break;
		}
		
		/*
		if(day == 1)
		{
			System.out.println("wear new clothes");
		}
		else if(day == 2)
		{
			System.out.println("hungry");
		}
		else if(day == 3)
		{
			System.out.println("climb mountain");
		}
		else if(day == 4)
		{
			System.out.println("watch TV");
		}
		else
		{
			System.out.println("Sorry I am tired");
		}
		*/
	}

}
