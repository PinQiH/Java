package com.hw.java16;

public class optest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte var1 = 10, var2 = 3;
		//byte var3 = var1 + var2;��̬�int�Φ�
		
		var1++;
		System.out.println(var1);
		
		var1 += 100; //var1 = var1 + 100
		System.out.println(var1);
		
		System.out.println(++var1);
		System.out.println(var1);
		
		System.out.println(var1++);
		System.out.println(var1); 
		
		var1 += 14;
		System.out.println(var1); 
		
		var1++; //�W�Xbyte�d��(-128~127)
		System.out.println(var1); 
	}

}
