package com.lx.javabase.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("all")
public class HashMapDemo {

	public static void main(String[] args) {

		Map Dog = new HashMap();
		Dog.put("美美", "土狗子");
		Dog.put("小白", "哈士奇");
		Dog.put("大黄", "秋田犬");
		Dog.put("日天", "泰迪犬");
		System.out.println("Map 元素如下：");
		System.out.println(Dog);

		System.out.println("请输入狗狗的名称：");
		Scanner input = new Scanner(System.in);
		String dog = input.nextLine();

		Dogs dog1 = new Dogs();
		dog1.name = dog;
		// Dog.containsKey(dog1.name) 判断是否含有dog1.name 这个值，返回true或者 false 值
		if (Dog.containsKey(dog1.name)) {
			System.out.println("在这个集合中找到了叫‘" + dog1.name + "’的这个狗狗！    这个狗狗的种类是：" + Dog.get(dog1.name) + "~~~");
		} else {
			System.out.println("在这个集合中没有找到叫‘" + dog1.name + "’的狗狗！");
		}

	}
}
