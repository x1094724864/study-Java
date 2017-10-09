package com.lx.javabase.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InputStreamText1 {

	public static void main(String[] args) throws Exception {

		File file = new File("/home/lx/Videos/新建文本 1.txt");
		FileInputStream input = new FileInputStream(file);
		File file2 = new File("/home/lx/Videos/9-17复制文本 1.txt");
		FileOutputStream output = new FileOutputStream(file2);

		BufferedInputStream bis = new BufferedInputStream(input);
		BufferedOutputStream bos = new BufferedOutputStream(output);

		System.out.println("复制开始！");
		int read = bis.read();
		while (read != -1) {
			bos.write(read);
			read = bis.read();
		}
		bis.close();
		bos.close();
		file.exists();
		file2.exists();
		System.out.println("复制结束！");
	}

}
