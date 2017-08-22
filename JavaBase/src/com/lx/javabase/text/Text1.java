package com.lx.javabase.text;

public class Text1 {
	public static void main(String[] args) {

		/*
		 * int b = 5; b++;System.out.println(b); b--;System.out.println(b);
		 * ++b;System.out.println(b); --b;System.out.println(b);
		 */

		/*
		 * int b = 5, c = 8; int d = b > c ? 4 : 6; System.out.println(d);
		 */
		/*int b = 5, c = 8; int d = b > c ? t: 6; 
		System.out.println(d);

		int i = 127;
		byte r = (byte) i;
		System.out.println("i= " + i);
		System.out.println("r= " + r);
	}*/
	
	int age = 10;
	//int a=--age*3;//此时的age先自减变成9，再参与计算；
	int a =3*age--;//此时的a还是age=10来参与运算，之后age自减变成9；
	System.out.println("a= " + a);
	System.out.println("age= " + age);
	
	
	
	
	
	
	
	}
	
	
	
	

	


/*
 * public class Text1{ public static void main(String[] args) { // 算术运算 //int a
 * = 32; int b = 5; // syso + alt +/ 可以快速完成System.out.println();的输入
 * //System.out.println("a = " + a); //System.out.println("b = " + b);
 * //System.out.println("a + b =" + a + b); // 通过使用()来改变运算顺序
 * //System.out.println("a + b =" + (a + b)); //System.out.println("a - b =" +
 * (a - b)); //System.out.println("a * b =" + (a * b));
 * //System.out.println("a / b =" + (a / b)); System.out.println(b); }
 * 
 * }
 * 
 */}