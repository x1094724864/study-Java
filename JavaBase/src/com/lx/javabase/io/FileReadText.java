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
		 File in = new File("/home/lx/Videos/新建文本 1.txt");
//		File in = new File("/home/lx/Videos/01教学目标学习方法01_2017-03-15_143037.wmv");
		 File ut = new File("/home/lx/Videos/文本复制.txt");
//		File ut = new File("/home/lx/Videos/视频文本复制.wmv");
		FileReader fr = new FileReader(in);
		FileWriter fw = new FileWriter(ut);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);

		System.out.println("我要开始 复制了");
//		 int read = fr.read();
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
