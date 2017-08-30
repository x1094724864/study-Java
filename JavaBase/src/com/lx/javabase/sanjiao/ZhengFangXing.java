package com.lx.javabase.sanjiao;

import java.util.Scanner;

public class ZhengFangXing {
	public static void main(String[] args) {

		System.out.println("请输入正方形的边长：\t");
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		// System.out.println("三角形的底边为:\n"+(2*h-1)+"\n");

		for (int i = 1; i <= h; i++) {
			System.out.print(i+"\t");
			for (int j = 1; j <= h; j++) {
				if (j <= h - (i - 1)) {
					System.out.print("* ");
				} else {
					// System.out.print("▲");
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		System.out.println("正方形的边长为："+4*(h-1)+"个‘*’。");
		
		
	}
}
