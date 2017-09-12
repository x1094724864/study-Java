package com.lx.javabase.array;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int[] a = { 1, 7, 5, 3, 8, 9, 6 };
		int lena = a.length;
		for (int i : a) {
			System.out.print(i + "\t");
			
		}
		System.out.println("\n--------------");

		System.out.println(a[(lena - 1) / 2]);
		System.out.println("--------------------------------------------------------");
		Arrays.sort(a);
		int[] b = a;
		for (int i : b) {
			System.out.print(i + "\t");

		}
		System.out.println("\n--------------");
		int lenb = b.length;

		System.out.println(b[(lenb - 1) / 2]);

		System.out.println(b[(lenb - 1) / 2]);

	}

}
