package com.lx.javabase.sanjiao;

import java.util.Scanner;

public class Sanjiao {
	public static void main(String[] args) {
		// 以三角形 高为2，底边长为3 为例假设 “o”为空，“x”为 点，所要打印三角形为
		// 1 o|o o o o o x o o o o o
		// 2 o|o o o o x x x o o o o
		// 3 o|o o o x x x x x o o o
		// 4 o|o o x x x x x x x o o
		// 5 o|o x x x x x x x x x o
		// 6 o|x x x x x x x x x x x
		/*
		 * i=1,x为第6个；i=2，x为第5，6，7个；i=3，x为第4，5，6，7，8个；i=4，x为第3，4，5，6，7，8，9个
		 * 
		 * 所以 第i行，x为第(11+1)/2-(i-1)个到第(11+1)/2+(i-1)共计2i-2+1个 
		 * 11为底边长，算法为(i+1)/2;
		 */
		// 所以，代码 如下：
		// tol=max-min+1;
		System.out.println("请输入三角形的高\t");
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		System.out.println("三角形的底边为:\n"+(2*h-1)+"\n");
		
		for (int i = 1; i <= h; i++) {
			System.out.print(i+"\t");
			for (int j = 0; j <= h + i; j++) {
				if (j <= h - (i-1)) {
					System.out.print(" ");
				} else {
//					System.out.print("▲");
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
