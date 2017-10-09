
package com.lx.javabase.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerText {

	public static void main(String[] args) throws Exception {

		InputStream inputStream = new FileInputStream("/home/lx/Videos/新建文本 1.txt");
		// OutputStream outputStream = new
		// FileOutputStream("/home/lx/Videos/9-17复制文本2.txt");
		File out = new File("/home/lx/Videos/9-17复制文本 2.txt");
		Scanner input = new Scanner(inputStream);
		PrintStream printStream = new PrintStream(out);
		// int read = input.nextInt();
		System.out.println("复制开始！");
		System.out.println();
		System.setOut(printStream);
		while (input.hasNext()) {
			String string = input.nextLine();
			System.out.println(string);
		}
		input.close();
		// out.close();
		out.exists();
		inputStream.close();
		printStream.close();
		System.out.println("复制结束！");
	}
}
