package com.lx.javabase.text1;

import java.util.Scanner;

public class KongXinSanJiao {
	public static void main(String[] args) throws Exception {
		int h;
		try {
			System.out.println("请输入三角形的高:\t");
			Scanner input = new Scanner(System.in);
			h = input.nextInt();
		} catch (Exception e) { 
			throw new Exception("输入的三角形高要是大于1的正整数！");
		}
		if (h <= 1) {
			throw new Exception("输入的三角形高要是大于1的正整数！");
		}

		// if(h<0) {
		// throw new Exception("输入的三角形高只能是正整数！");
		// }
		System.out.println("三角形的底边为:\n" + (h + 0) + "\n");
		for (int i = 0; i < h; i++) {
			System.out.print("");
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
				System.out.println("警告！！！三角形将会向左移动,但是三角形可能会变形甚至消失！");
				System.out.println("三角形将会向左移动" + (0 - len) + "个单位。");

			} else {
				System.out.println("三角形将会向右移动" + len + "个单位。");
			}
		} catch (Exception e) {
			throw new Exception("输入的偏移量参数只能是整数！");
		}
		if (len >= 0) {
			movetoright(h, len);
		} else {
			movetoleft(h, len);
		}
	}

	public static void movetoleft(int h, int len) {
		int leng = 0 - len;
		for (int i = 0; i < h; i++) {
			System.out.print("");
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
				for (int j = 0; j <= h + leng; j++) {
					if (j < h - leng) {
						System.out.print("* ");
					} else if (j >= h - leng && j < h) {
						System.out.print("← ");
					}
				}
			}
		}
	}

	public static void movetoright(int h, int len) {
		for (int i = 0; i < h; i++) {
			System.out.print("");
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
				for (int j = 0; j < h + len; j++) {
					if (j < len) {
						System.out.print("→ ");
					} else {
						System.out.print("* ");
					}
				}
			}
		}
	}
}
