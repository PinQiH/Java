package com.hw.java16;

public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hit = 0;
		int total = 0;
		
		while(true)
		{
			float x = (float)Math.random() * 2 - 1; //Math.random 0~1ÀH¾÷ //³Ì²×½d³ò¬°-1~1
			float y = (float)Math.random() * 2 - 1; 
			
			if(Math.pow(x, 2) + Math.pow(y, 2) < 1)
			{
				hit++;
			}
			
			System.out.println((float)hit / (float)total * 4.0f);
			System.out.println(hit + total)
			total++;
		}
	}

}
