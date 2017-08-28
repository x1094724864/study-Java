package com.lx.javabase.sanjiao;

public class textsanjiao {

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) { 
			System.out.print(i);
			for (int j = 0; j <= 8 + i; j++) { 
				if (j <= 9 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
