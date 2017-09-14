package com.lx.javabase.enumdemo;

import java.util.EnumMap;
import java.util.Map.Entry;
import java.util.Scanner;

@SuppressWarnings("all")
public class TextMonthEunm {

	public static void main(String[] args) {

		for (MonthEnum mon : MonthEnum.values()) {
			System.out.println("枚举中有：" + mon);
			System.out.println("他叫" + mon.getName() + ",共有" + mon.getDays() + "天！");
			// System.out.println("他叫"+mon.getName()+"共有"+mon.getDays()+"天！");
		}
		// MonthEnum.APR.getName();
		System.out.println("--------------");
		// Scanner input =new Scanner(System.in);
		// String osEnum=input.nextLine();

		MonthEnum mE = MonthEnum.DEC;
		switch (mE) {
		case JAN:
			System.out.println(MonthEnum.JAN.getName() + "～～\t");
			break;
		case JUL:
			System.out.println(MonthEnum.JUL.getName() + "～～\t");
			break;
		case MAR:
			System.out.println(MonthEnum.MAR.getName() + "～～\t");
			break;
		case MAY:
			System.out.println(MonthEnum.MAY.getName() + "～～\t");
			break;
		case DEC:
			System.out.println(MonthEnum.DEC.getName() + "～～\t");
			break;
		case OCT:
			System.out.println(MonthEnum.OCT.getName() + "～～\t");
			break;
		}

		EnumMap<MonthEnum, Integer> enumMap = new EnumMap(MonthEnum.class);
		enumMap.put(MonthEnum.JAN, 1);
		enumMap.put(MonthEnum.FEB, 2);
		enumMap.put(MonthEnum.MAR, 3);
		enumMap.put(MonthEnum.APR, 4);
		enumMap.put(MonthEnum.MAY, 5);
		enumMap.put(MonthEnum.JUN, 6);
		enumMap.put(MonthEnum.JUL, 7);
		enumMap.put(MonthEnum.AUG, 8);
		enumMap.put(MonthEnum.SEP, 9);
		enumMap.put(MonthEnum.OCT, 10);
		enumMap.put(MonthEnum.NUV, 11);
		enumMap.put(MonthEnum.DEC, 12);
		for (Entry<MonthEnum, Integer> string : enumMap.entrySet()) {
			System.out.println(string + "++++" + string.getValue() + "---" + string.getKey());
			System.out.println("我是："+string.getKey().name()+"我叫做："+string.getKey().getName()+",    我有："+string.getKey().getDays()+"天。  其实我在系统中默认是第"+string.getKey().ordinal()+"个位置，不是"+string.getValue());
		}

	}

}
