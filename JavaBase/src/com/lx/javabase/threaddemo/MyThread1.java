package com.lx.javabase.threaddemo;

public class MyThread1 extends Thread {

	public static void run1() {
		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "：" + i);
		}
	}
}
