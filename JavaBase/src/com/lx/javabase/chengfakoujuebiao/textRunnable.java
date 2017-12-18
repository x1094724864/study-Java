
package com.lx.javabase.chengfakoujuebiao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Scanner;

public class textRunnable {

	// String iString = input.next();
	// File output = new
	// File("/opt/JavaDoc/Git/study-Java/JavaBase/src/com/lx/javabase/chengfakoujuebiao/123.txt");
	// FileOutputStream fos = new FileOutputStream(output);
	public static void main(String[] args) throws Exception {

		PrintMath chengFaRunnable = new PrintMath();
		Thread thread = new Thread(chengFaRunnable);
		thread.start();
	
		
		
		
		
	}

}

class PrintMath implements Runnable {

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

class ReadMath implements Runnable{
	
	@Override
	public void run() {
	
		// TODO Auto-generated method stub
		
		
		
		
		
		
	}
}


