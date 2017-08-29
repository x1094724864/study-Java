package com.lx.javabase;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Students {
	private static String name;
	private static int age;
	private static boolean sex;
//	Students student = new Students();
//	Students student = new Students();
//	Students student = new Students();

	public   Students(String name,int age,boolean sex) {

		System.out.println("我会游泳，我会下棋");
	}

	
//	public static void main() {
//		Students student=new Students(name, age, sex);
//		student.name=name;	
//		student.age=23;
//		student.sex=true;
//	}
//	
	
}
