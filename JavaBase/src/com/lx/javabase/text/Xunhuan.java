package com.lx.javabase.text;

public class Xunhuan {

	public static void main(String[] args) {
		// while 循环----先判断条件，在是否执行循环
		/*
		 * int n = 1; while (n <= 100) { System.out.println("第" + n + "遍，好好学习天天向上");
		 * n++; }
		 */
		// do....while 循环，先执行 循环体一次，再判断条件是否成立
		/*
		 * int i = 1; do { System.out.println("第" + i + "好好学习，天天向上！");
		 * 
		 * i++; } while (i < 100);
		 */
		// do.......while 循环可以替代while循环，两者区别是do......while至少要先执行一次循环，while循环可能一次也不执行！

		// 传统的for循环
		/*
		 * for (int i=1; i <= 100; i++) { System.out.println("第" + i + "好好学习，天天向上for");
		 * }
		 */
		// for循环的初始变量i的声明可以在上面，也可以声明在for条件里面
		/*
		 * int i; for (i = 1; i <= 100; i++) { System.out.println("第" + i +
		 * "好好学习，天天向上for"); }
		 */

		String[] array = { "AA", "BB", "CC", "DD" };
		for (String string : array) {
			if (string.equals("CC")) {
				return;
			}
			System.out.println(string);
		}
		System.out.println("傻X");

	}

}
