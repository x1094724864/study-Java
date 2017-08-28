package com.lx.javabase.oop;

public class TextAvg {

	public static void main(String[] args) {

		float avg = 0.0f;
		AvgAndSum aas = new AvgAndSum();

		avg = aas.avg();
		System.out.println("三门课程平均成绩:" + avg);

	}

}
