package com.lx.javabase.text;

import lombok.Getter;

@Getter
public class Single {
	private static Single sin = new Single();

	private Single() {
		System.out.println("私有化构造方法！");
	}

	// public Single getSin() {
	// return sin;
	public static Single getSin() {
		return sin;
	}

}
