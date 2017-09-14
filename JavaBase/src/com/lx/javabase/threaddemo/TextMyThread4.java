package com.lx.javabase.threaddemo;

import java.text.SimpleDateFormat;
import java.util.Date;
@SuppressWarnings("all")
public class TextMyThread4 {
	public static void main(String[] args) throws Exception {
		MyThread4 myThread = new MyThread4();
		myThread.start();
		myThread.sleep(3000);
		myThread.flag = false;
	}
}

class MyThread4 extends Thread {
	boolean flag = true;

	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  hh:mm:ss:SSSS");
		while (flag) {
			System.out.println(sdf.format(new Date()));
			try {
				MyThread4.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
