package com.lx.javabase.sanjiao;

public class Mathchengfa {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.print(i+"  ");
			for (int j = 0; j <= 9; j++) {
				if (j <= i) {
					System.out.print(j+"*"+i+"="+(j*i)+" \t");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

}
