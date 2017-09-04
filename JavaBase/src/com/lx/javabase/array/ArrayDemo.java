package com.lx.javabase.array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] phoneNumber;
		phoneNumber = new int[6];
		phoneNumber[0] = 11;
		phoneNumber[1] = 25;
		System.out.println("数组中的第一个数是：" + phoneNumber[0] + "数组中的第二个数是：" + phoneNumber[1]);
		System.out.println("数组中的第六个数是：" + phoneNumber[5] + "数组中的第三个数是：" + phoneNumber[2]);

		System.out.println("-----------------------");

		int[] scores = new int[] { 21, 115, 54, 74, 71 };
		System.out.println("数组从小到大排列为：\n");
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}

		System.out.println("\n\n\n数组从大到小排列为：\n");
		int j = scores.length;

		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[j - i - 1] + "\t");
		}

		int[] money= {652,855,824,148,467,1204,475};
		
		
		
		
	}

}
