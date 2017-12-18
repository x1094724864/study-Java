package com.lx.javabase.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadText {
	@SuppressWarnings("all")
	public static void main(String[] args) throws Exception {
		File in = new File("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt");
		File ut = new File("E:\\java资料\\视屏\\beifen.txt");
		// File in = new File("E:\\java资料\\视屏\\Idea配置Tomcat服务器.avi");
		// File ut = new File("E:\\java资料\\视屏\\beifen.avi");
		FileReader fr = new FileReader(in);
		FileWriter fw = new FileWriter(ut);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);

		System.out.println("我要开始 复制了");
		// int read = fr.read();
		int read = br.read();

		while (read != -1) {
			// fw.write(read);
			// read = fr.read();
			bw.write(read);
			read = br.read();
			bw.flush();

		}
		br.close();
		bw.close();

		fr.close();
		fw.close();
		System.out.println("复制结束！！");
	}
}
