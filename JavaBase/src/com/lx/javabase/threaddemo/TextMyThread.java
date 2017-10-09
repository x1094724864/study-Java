
package com.lx.javabase.threaddemo;

public class TextMyThread {

	public static void main(String[] args) {

		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.start();
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.start();
		// thread1.run();
		// thread2.run();
		for (int i = 0; i < 30; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "：" + i);

		}
		System.out.println("threadID：" + Thread.currentThread().getId());
		// MyThread1 _thread1 = new MyThread1();
		// _thread1.setName("_thread1");
		// _thread1.start();
		// MyThread1 _thread2 = new MyThread1();
		// _thread2.setName("_thread2");
		// _thread2.start();
		// MyThread1.run1();
	}

}

class MyThread extends Thread {

	public void run() {

		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "：" + i);
		}
	}
}
