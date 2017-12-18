package com.lx.javabase.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

@SuppressWarnings("all")
public class InputStreamtext {

	public static void main(String[] args) throws Exception {
		// File input = new File("/home/lx/Videos/01教学目标学习方法01_2017-03-15_143037.wmv");
		File input = new File("E:\\java资料\\视屏\\Idea配置Tomcat服务器.avi");
		File out = new File("E:\\java资料\\视屏\\beifen.mp4");
		FileInputStream fis = new FileInputStream(input);
		// File out = new File("/home/lx/Videos/复制.wmv");
		FileOutputStream fos = new FileOutputStream(out);

		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int read = bis.read();
		System.out.println("我要开始 复制了");
		while (read != -1) {
			bos.write(read);
			read = bis.read();
		}
		bis.close();
		bos.close();
		fos.close();
		fis.close();

		System.out.println("复制结束！");
	}
}
