#運算練習

package com.hw.java16;

public class optest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte var1;
		short var2 = 129;
		var1 = (byte)var2; //把大單位放進小單位裡，所以失去精準度
		System.out.println(var1);
	}

}
