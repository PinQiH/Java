package com.hw.java16;

import java.util.Scanner;

public class arrtest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int NUM_ROLLS = scanner.nextInt();
		float average = (float)NUM_ROLLS / 6.0f;
		
		int[] dicecounter = new int[6]; //骰子每一面出現次數
		
		for(int i = 0; i < NUM_ROLLS; i++)
		{
			int number = (int)(Math.random() * 5.9999999); //當次骰出的數字 //Math.random為double格式 //(int)強制捨去小數點
			
			dicecounter[number]++;
		}
		
		System.out.println("one:   "+ dicecounter[0]+ "   "+ ((float)dicecounter[0] - average)/average * 100.0f+ "%");
		System.out.println("two:   "+ dicecounter[1]+ "   "+ ((float)dicecounter[1] - average)/average * 100.0f+ "%");
		System.out.println("three: "+ dicecounter[2]+ "   "+ ((float)dicecounter[2] - average)/average * 100.0f+ "%");
		System.out.println("four:  "+ dicecounter[3]+ "   "+ ((float)dicecounter[3] - average)/average * 100.0f+ "%");
		System.out.println("five:  "+ dicecounter[4]+ "   "+ ((float)dicecounter[4] - average)/average * 100.0f+ "%");
		System.out.println("six:   "+ dicecounter[5]+ "   "+ ((float)dicecounter[5] - average)/average * 100.0f+ "%");
	}

}
