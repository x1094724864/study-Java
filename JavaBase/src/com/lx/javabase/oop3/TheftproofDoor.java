package com.lx.javabase.oop3;

public class TheftproofDoor extends Door implements DoorBell, LockDoor {

	@Override
	public void lockUp() {
		System.out.println("扭锁，门开了");
	}

	@Override
	public void openLock() {
		System.out.println("再扭锁，门就关了");
	}

	@Override
	public void photo() {
		System.out.println("我拍照咯！！！");
	}

}
