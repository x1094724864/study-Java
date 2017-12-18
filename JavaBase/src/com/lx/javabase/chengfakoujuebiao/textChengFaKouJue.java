
package com.lx.javabase.chengfakoujuebiao;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Scanner;

public class textChengFaKouJue {

	public static void main(String[] args) throws IOException {

		Runnable myrun = new MyRun();
		Thread thread = new Thread(myrun);
		thread.start();
		 Thread thread2 = new Thread();
	
		Console in = System.console();
		String consolein = in.readLine();
		System.out.println("我是" + in);

		Scanner input = new Scanner(System.in);
		input.nextLine();
		// FileInputStream fis = new FileInputStream(Systemin);
		File output = new File(
		"E:\\JavaDoc\\GitHub\\study-Java\\JavaBase\\src\\com\\lx\\javabase\\chengfakoujuebiao\\textChengFaKouJue.txt");
		// FileOutputStream fos = new FileOutputStream(output);
		// PrintStream out = new PrintStream(fos);

//		FileReader fr = new FileReader(output);
		FileWriter fWriter = new FileWriter(output);

		// System.setOut(out);
		// System.out.println("线程结束！");
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