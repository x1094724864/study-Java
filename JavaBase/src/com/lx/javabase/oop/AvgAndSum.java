package com.lx.javabase.oop;

import java.util.Scanner;

public class AvgAndSum {

	public int sum() {
		int sum = 0;
		System.out.println("请输入三门课程成绩的第一门：");
		Scanner input = new Scanner(System.in);
		sum = sum + input.nextInt();

		System.out.println("请输入三门课程成绩的第二门：");
		sum = sum + input.nextInt();
		System.out.println("请输入三门课程成绩的第三门：");
		sum = sum + input.nextInt();
		return sum;

	}

	public float avg() {
		float avg = (float) sum() / 3;

		return  avg;

	}

}
