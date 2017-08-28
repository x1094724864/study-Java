package com.lx.javabase.oop;

public class TextSchool {

	public static void main(String[] args) {
		// 创建一个School实例对象
		School center = new School(); // 声明了一个School类型的叫做center的变量，指向刚才创建出来的对象（new School();）
		System.out.println("center 初始化以前:");

		center.showCenter();
		// center 初始化以前。
		// 学校的名称是：null，教室的数量是：0机房的数量是：0。
		// 属性是基本数据类型，会有默认初始值；引用类型会是空值null

		center.schoolName = "新安";
		center.classNum = 23;
		center.labNum = 12;
		System.out.println("center 初始化之后:");
		center.showCenter();

	}
}
