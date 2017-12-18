package com.lx.javabase.file;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {

		File file1 = new File("E:\\JavaDoc\\GitHub\\study-Java\\JavaBase\\jbit.log");
		File file2 = new File("E:\\JavaDoc\\GitHub\\study-Java");
		System.out.println("file1.exists():" + file1.exists());
		System.out.println("file1.getAbsolutePath():" + file1.getAbsolutePath());
		System.out.println("file1.getAbsoluteFile():" + file1.getAbsoluteFile());
		System.out.println("file1.canExecute():" + file1.canExecute());
		System.out.println("file2.list():" + file2.exists());
		System.out.println("file2.list():" + file2.list());
	}

}
