package com.hw.java16;

public class optest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var1 = 10;
		int var2 = 3;
		int var3;
		
		var3 = var1 + var2;
		System.out.printf("var1 + var2 = %d\n", var3); //�u������޸� //println(int)
		
		var3 = var1 - var2;
		System.out.printf("var1 - var2 = %d\n", var3);
		
		var3 = var1 * var2;
		System.out.printf("var1 * var2 = %d\n", var3);
		
		var3 = var1 / var2; //�����
		System.out.printf("var1 / var2 = %d\n", var3);
		
		var3 = var1 % var2; //���l��
		System.out.printf("var1 %% var2 = %d\n", var3); //��%�~�ॿ�`���
	}

}
