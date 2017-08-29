package com.lx.javabase.oop2;

public class Dog extends Pet {
	String strain;

	public void print() {
		System.out.println("我是Dog");
		System.out.println("我叫" + name + "\t我今年" + age + "\n我和主人的亲密度是：" + love + "\n我的健康度是：" + heath);
	}

}
