
package com.lx.javabase.chengfakoujuebiao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

public class TextMath implements Runnable {

	@Override
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

	public static void main(String[] args) {

		PrintMath chengFaRunnable = new PrintMath();
		Thread thread = new Thread(chengFaRunnable);
		thread.start();
		File file = new File("/home/lx/Desktop/TextMath.txt");
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(file);
			PrintStream out = new PrintStream(fos);
			System.setOut(out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
