
package com.lx.javabase.chengfakoujuebiao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

public class textChengFaKouJue {

	public static void main(String[] args) throws FileNotFoundException {

		Runnable myrun = new MyRun();
		Thread thread = new Thread(myrun);
		thread.start();
		 File file = new File("/home/lx/Desktop/textChengFaKouJue.txt");
		 FileOutputStream fos = new FileOutputStream(file);
		 PrintStream out = new PrintStream(fos);
		 System.setOut(out);
//		 System.out.println("线程结束！");
	}

}

class MyRun implements Runnable {

	public void run() {

		Class<ChengFaKouJue> clazz = ChengFaKouJue.class;
		try {
			ChengFaKouJue obj = clazz.newInstance();
			Method method = clazz.getDeclaredMethod("math");
			method.setAccessible(true);
	 
			method.invoke(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}