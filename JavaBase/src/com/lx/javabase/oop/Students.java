package com.lx.javabase.oop;

public class Students {

//	String name;
//	int age;
//	int classNum;
//	String hobby;
//	public void show() {
//		System.out.println("\n姓名:"+name+"\n年龄:"+age+"\n班级:"+classNum+"\n爱好:"+hobby);
//	}
	
//	String[] names=new String[30];
	String[] names= {"张三","李四","王五","赵六","田七"};
	public void addName(int index,String name) {
		names[index]=name;
		
	}
	public void showNames() {
		System.out.println("数组的内容是：");
//	System.out.println(names.toString());
	for (String string : names) {
		if (string!=null) {
			
			System.out.println(string);
		}
	}
	
}
	
	 public boolean searchName (int start,int end,String name) {
			boolean find = false;  // 是否找到标识
			// 指定区间数组中，查找姓名
			for(int i=start-1;i<end;i++) {
			      if(names[i].equals(name)) {	
				  find=true;
				  break;
			      }
			}
			return find;
		}

	
}
