package com.lx.javabase.exception;

public class TextExceptionDemo {

	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		try {
			ed.setAge();
		} catch (Exception e) {
			System.out.println("您输入的年龄有问题↓↓↓↓↓↓");
			e.printStackTrace();
		}

	}

}
