package com.lx.javabase.oop;

import java.util.Scanner;

//import com.lx.javabase.demo.newP;

public class TextStudengs {

	public static void main(String[] args) {

		// Students student = new Students();
		// student.classNum = 412;
		// student.age = 23;
		// student.name = "龙傲天";
		// student.hobby = "游泳";
		// student.show();//调用前面编写的TextSchool中的show方法

		Students sb = new Students();
		// Scanner input = new Scanner(System.in);
		// for (int i = 0; i < 5; i++) {
		//
		// System.out.println("请输入" + (i + 1) + "个姓名：");
		// String name = input.nextLine();
		// sb.addName(i, name);
		// }
		// sb.showNames();
		boolean finded = sb.searchName(6, 2, "王五");

		if (finded) {
			System.out.println("找到该学生了！");
		} else {
			System.out.println("没找到该学生！");
		}

	}

}
