package com.lx.javabase.text1;

import java.util.Scanner;

public class gudingdanjiaoxing {
	public static void main(String[] args) throws Exception {
		int h;
		try {
			System.out.println("请输入三角形的高\t");
			Scanner input = new Scanner(System.in);
			h = input.nextInt();
			if (h < 0) {
				throw new Exception("输入的三角形高只能是正整数！");
			}
		} catch (Exception e) {
			throw new Exception("输入的三角形的高只能是正整数！");
		}

		// if(h<0) {
		// throw new Exception("输入的三角形高只能是正整数！");
		// }
		System.out.println("三角形的底边为:\n" + (h + 0) + "\n");
		for (int i = 0; i < h; i++) {
			System.out.print((i + 1) + "\t");
			if (i < h - 1) {
				for (int j = 0; j <= h + i - 1; j++) {
					if (j == h + i - 1) {
						System.out.print("*");
					} else if (j == h - i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			} else {
				for (int j = 0; j < h; j++) {
					System.out.print("* ");
				}
			}
		}
		System.out.print("\n");
		int len;
		try {
			System.out.println("请输入你想要进行移动的偏移量参数：");
			Scanner input2 = new Scanner(System.in);
			len = input2.nextInt();
			if (len < 0) {
				throw new Exception("输入的偏移量参数只能是正整数！");
			}
		} catch (Exception e) {
			throw new Exception("输入的偏移量参数只能是正整数！");
		}

		System.out.println("三角形将会向右移动：" + len);
		for (int i = 0; i < h; i++) {
			System.out.print((i + 1) + "\t");
			if (i < h - 1) {
				for (int j = 0; j <= h + i - 1 + len * 2; j++) {
					if (j == h + i - 1 + len * 2) {
						System.out.print("*");
					} else if (j == h - i - 1 + len * 2) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			} else {
				for (int j = 0; j < h + len * 2; j++) {
					if (j < len * 2) {
						System.out.print(" ");
					} else {

						System.out.print("* ");
					}
				}
			}
		}

	}
}
