package com.lx.javabase.oop2;

import java.awt.print.Printable;

public class Text {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.age = 8;
		dog.heath = 85;
		dog.name = "小白";
		dog.strain = "金毛";
		dog.love = 95;
		dog.print();
		System.out.println("\n\n");

		Cat cat = new Cat();

		cat.print();

	}

}
