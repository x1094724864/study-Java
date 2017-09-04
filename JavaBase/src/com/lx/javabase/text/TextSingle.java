package com.lx.javabase.text;

import lombok.Getter;

@Getter
public class TextSingle {

	public static void main(String[] args) {
		Single sle1 = Single.getSin();
		Single sle2 = Single.getSin();
		Single sle3 = Single.getSin();
		System.out.println("我在打印第二个" + sle2);
		System.out.println("我在打印第一个" + sle1);
		System.out.println("我在打印第三个" + sle3);
	}

}
