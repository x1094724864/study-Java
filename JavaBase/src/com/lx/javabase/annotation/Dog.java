package com.lx.javabase.annotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog {
	@DogAnnotation("美美")
	private String name;

	private int age;
	@DogAnnotation
	private String sex;
//	@DogAnnotation
	private String price;

	public static void main(String[] args) {

	}

	public Dog() {
		super();
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", sex=" + sex + ", price=" + price + "]";
	}

}
