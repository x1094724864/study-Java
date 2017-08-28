package com.lx.javabase.text;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入Java课程分数:");
		int score = input.nextInt();
		// String score1 = input.nextLine();// 这里的score1只能输入String类型的数据
		// switch case 多路分支；
		/*
		 * switch (score) { case 90: System.out.println("你的成绩是：90，非常好\n"); break; case
		 * 80: System.out.println("你的成绩是：80，很好\n"); break; case 70:
		 * System.out.println("你的成绩是：70，还好\n"); break; case 60:
		 * System.out.println("你的成绩是：60，及格了\n"); break; default:
		 * System.out.println("你妹及格！！！"); }
		 */

		// 分支嵌套；
		/*
		 * System.out.println("----------------------\n"); if (score > 60) { if (score
		 * >= 80) { if (score >= 90) { System.out.println("你成绩优秀！！"); } else {
		 * System.out.println("你成绩良好！！！"); } } else {
		 * System.out.println("你成绩在60~80之间！！！"); } } else {
		 * System.out.println("你不及格！！！"); }
		 */

		System.out.println("你的成绩是：" + score);
		// System.out.println("你的成绩是："+score1);
	}
}
