package com.hw.java16;

public class optest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float var1 = 10;
		float var2 = 3.0f; //有小數點加f
		float var3;
		
		var3 = var1 + var2;
		System.out.printf("10 + 3.0f = %f\n", var3);
		System.out.printf("10 + 3.0f = %.2f\n", var3); //取小數點後兩位
		
		var3 = var1 / var2;
		System.out.printf("10 / 3.0f = %.2f\n", var3);
		
		var3 = var1 % var2;
		System.out.printf("10 %% 3.0f = %.2f\n", var3); 
		
		var3++;
		System.out.printf("var3++ = %.2f\n", var3); 
	}

}
