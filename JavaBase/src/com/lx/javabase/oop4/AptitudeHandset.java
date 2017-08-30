package com.lx.javabase.oop4;

public class AptitudeHandset extends Handset implements NetWork, TheakePictures {

	@Override
	public void takePicture() {
System.out.println("我能照相！！！");
	}

	@Override
	public void connectNet() {
System.out.println("我不能联网！！！");
	}

}
