package com.lx.javabase.oop3;

import com.lx.javabase.oop3.Door;

public class TheftproofDoor2 extends Door implements DoorBell, LockDoor {

	 public void lockUp() {
		System.out.println("扭锁，门开了");
	}

	
	 public void openLock() {
		System.out.println("再扭锁，门就关了");
	}
	
	 public void photo() {
		System.out.println("我拍照咯！！！");
	}


}
