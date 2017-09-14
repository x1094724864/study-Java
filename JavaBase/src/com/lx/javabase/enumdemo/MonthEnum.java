package com.lx.javabase.enumdemo;

import lombok.Getter;

public enum MonthEnum {

	JAN("一月",31),
	FEB("二月",28), 
	MAR("三月",31), 
	APR("四月",30), 
	MAY("五月",31), 
	JUN("六月",30), 
	JUL("七月",31), 
	AUG("八月",31), 
	SEP("九月",30), 
	OCT("十月",31), 
	NUV("十一月",30), 
	DEC("十二月",31);

	@Getter
	private final String name;
	@Getter
	private final int days;
	private MonthEnum(String name, int days) {
		this.name = name;
		this.days = days;
	}
public void  printSelf() {
	System.out.println("我是："+this);
	System.out.println("-----------------");
	System.out.println("我是："+this.name()+this.days);
	
}

	
	
}
