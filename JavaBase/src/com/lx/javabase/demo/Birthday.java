package com.lx.javabase.demo;

public class Birthday {
	private int day;
	private int month;
	private int year;
	public void displayer(int year, int month, int day) {
		day = 11;
		month = 11;
		year = 2015;
		System.out.println("传递方法中：" + year + "-" + month + "-" + day);
	}

	public void displayer(Birthday birthday) {
		birthday.day = 12;
		birthday.month = 11;
		birthday.year = 2012;
		System.out.println("引导传递方法中"+birthday.year+"-"+birthday.month+"-"+birthday.day);		
	}

	public static void testValue1() {
		Birthday birthday = new Birthday();
		int year=2017;
		int month=11;
		int day=12;
		System.out.println("传递之前"+year+"-"+month+"-"+day);
		birthday.displayer(year, month, day);
		System.out.println("传递之前"+year+"-"+month+"-"+day);		
	} 
	
	public static void testValue2() {
		Birthday birthday = new Birthday();
		birthday.year=2017;
		birthday.month=3;
		birthday.day=2;
		System.out.println("引导传递之前"+birthday.year+"-"+birthday.month+"-"+birthday.day);
		birthday.displayer(birthday);	
		System.out.println("引导传递之后"+birthday.year+"-"+birthday.month+"-"+birthday.day);
		}
		
	public static void main(String[] args) {
		testValue1();		
		testValue2();	
	}
	

	
}
