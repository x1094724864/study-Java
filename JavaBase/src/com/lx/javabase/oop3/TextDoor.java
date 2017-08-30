package com.lx.javabase.oop3;

import java.util.function.DoubleBinaryOperator;

public class TextDoor {

	public static void main(String[] args) {
		TheftproofDoor td = new TheftproofDoor();
		DoorBell bell = td;
		LockDoor lock = td;
		Door door = td;
		door.close();
		door.open();
		bell.photo();
		lock.lockUp();
		lock.openLock();
	}

}
