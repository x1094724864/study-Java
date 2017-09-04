package com.lx.javabase.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;
import com.sun.javafx.geom.AreaOp.AddOp;

@SuppressWarnings("all")
public class HashMapText {
	public static void main(String[] args) {
		HashMap<String, String> Penguins = new HashMap();
		Penguins.put("东北大哥", "公");
		Penguins.put("你啥瞅啥瞅", "公");
		Penguins.put("大白", "母");
		Penguins.put("小黑", "公");
		Penguins.put("美美", "公");
		
		System.out.println("目前企鹅的集合里有以下内容：");
		System.out.println(Penguins);
		//对key值进行迭代
		System.out.println("☆☆☆☆☆☆☆☆对key值进行迭代☆☆☆☆☆☆☆☆");
		Penguins.keySet();
		Set<String> key=Penguins.keySet();
//		System.out.println(Penguins.keySet());
		//用 for each 进行迭代
		System.out.println("---------用 for each 进行迭代---------");
		for (String string : key) {
			System.out.println(string);			
		}
		//用Iterator 迭代器进行遍历
		System.out.println("---------用Iterator 迭代器进行遍历---------");
		Iterator<String> iterator1 =key.iterator();
		while (iterator1.hasNext()) {
			String string = (String) iterator1.next();
			System.out.println(string);
		}
		//对value值进行迭代
		System.out.println("☆☆☆☆☆☆☆☆对value值进行迭代☆☆☆☆☆☆☆☆");
		//用 for each 进行迭代
		System.out.println("---------用 for each 进行迭代---------");
		Collection<String> value=Penguins.values();
		for (String string : value) {
			System.out.println(string);
		}
		//用Iterator 迭代器进行遍历
		System.out.println("---------用Iterator 迭代器进行遍历---------");
		Iterator<String> iterator2=value.iterator();
		while (iterator2.hasNext()) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
		//对key 和value值进行迭代
		System.out.println("☆☆☆☆☆☆☆☆对key 和value值进行迭代☆☆☆☆☆☆☆☆");
		//用 for each 进行迭代
		System.out.println("---------用 for each 进行迭代---------");
		Set<Entry<String, String>> pg=Penguins.entrySet();
		for (Entry<String, String> string : pg) {
			System.out.print(string+"\t");
			System.out.println("\t"+string.getKey() + "----" + string.getValue());
		}
		//用Iterator 迭代器进行遍历
		System.out.println("---------用Iterator 迭代器进行遍历---------");
		Iterator<Entry<String, String>>  iterator3=pg.iterator();
		while (iterator3.hasNext()) {
			Entry<String,String> string = (Entry<String,String>) iterator3.next();
			System.out.print(string+"\t");
			System.out.println("\t"+string.getKey()+"----------"+string.getValue());
		}
		
//		System.out.println(Penguins.values());	
//		System.out.println(Penguins.keySet() + "-------" + Penguins.values());

	}

}
