package com.lx.javabase.oop4;

public abstract class Handset {
	String brand;
	String type;

	public void sendInfo() {
		System.out.println("我会发送信息！");
	}

	public void call() {
		System.out.println("我会打电话！");
	}

	public void info() {
		System.out.println("我会接受信息！");
	}

}
