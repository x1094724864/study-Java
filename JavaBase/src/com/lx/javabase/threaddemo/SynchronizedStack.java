package com.lx.javabase.threaddemo;

public class SynchronizedStack {
	private int index = 0;
	private char[] data = new char[5];

	public synchronized void push(char c) {
		while (index == data.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		data[index] = c;
		index++;
	}

	public synchronized char pop() {
		while (index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		return data[index];
	}
}

class Producer implements Runnable {
	SynchronizedStack stack;

	public Producer(SynchronizedStack s) {
		stack = s;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			char c = (char) (Math.random() * 26 + 'A');
			stack.push(c);
			System.out.println("生产:" + c);
			try {
				Thread.sleep((int) (100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	SynchronizedStack stack;

	public Consumer(SynchronizedStack s) {
		stack = s;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			char c = stack.pop();
			System.out.println("消费:" + c);
//			try {
//				Thread.sleep((int) ( 500));
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}
