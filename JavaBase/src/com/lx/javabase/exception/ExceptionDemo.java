package com.lx.javabase.exception;

import java.util.Scanner;

import lombok.Setter;

@Setter
public class ExceptionDemo {
	// private static Object setAge;

	public static void main(String[] args) throws Exception {
		setAge();
		System.out.println("----------");
	}

	public static int setAge() throws Exception {

		int age;
		System.out.println("请输入您的年龄：");
		Scanner input = new Scanner(System.in);
		age = input.nextInt();

		if (0 < age && 100 > age) {
			System.out.println("您的年龄是" + age);
		} else {
			throw new Exception("年龄必须在1到100之间！");
		}
		return age;
	}
}
