package com.lx.javabase.threaddemo;


public class SynchronizedStackText {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SynchronizedStack stack = new SynchronizedStack();
		Runnable p = new Producer(stack);
		Runnable c = new Consumer(stack);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}

}
