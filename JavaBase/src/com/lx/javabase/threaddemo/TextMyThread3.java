package com.lx.javabase.threaddemo;

public class TextMyThread3 {
@SuppressWarnings("all")
	public static void main(String[] args) {
		System.out.println("Main thread is start!");
		MyThread3 thread1 = new MyThread3(50);
		thread1.setName("thread1");
		thread1.setPriority(10);
		thread1.start();
		MyThread3 thread2 = new MyThread3(100);
		thread2.setDaemon(true);
		thread1.setPriority(1);
		thread2.setName("thread2");
		thread2.start();

		for (long i = 0; i < 100; i++) {
			String threadName3 = Thread.currentThread().getName();
			System.out.println(threadName3 + ":" + i);
		}
		System.out.println("Main thread is finished!");
	}
}

class MyThread3 extends Thread {
	private int n = 0;
	public MyThread3(int n) {
		super();
		this.n = n;
	}
	public void run() {
		String threadName3 = Thread.currentThread().getName();
		System.out.println(threadName3 + " is start!");
		for (int i = 0; i < n; i++) {
			System.out.println(threadName3 + "：" + i);
		}
		System.out.println(threadName3 + " is finished!");
	}
}