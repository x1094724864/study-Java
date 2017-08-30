package com.lx.javabase.oop4;

public class TextAHandset {

	public static void main(String[] args) {
		AptitudeHandset ahset = new AptitudeHandset();

		TheakePictures tp = ahset;
		NetWork nw = ahset;
		Handset handset=ahset;
		
		tp.takePicture();
		nw.connectNet();
		handset.call();
		
		
		
	}

}
