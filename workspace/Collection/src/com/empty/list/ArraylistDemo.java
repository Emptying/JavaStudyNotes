package com.empty.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> book = new ArrayList<>();
		book.add("语文");
		book.add("英语");
		book.add("数学");
		book.set(0, "yuwen");
		
		//使用Iterator迭代器来遍历集合
		Iterator<String> it = book.iterator();
		while(it.hasNext()){
			String name=it.next();
			System.out.println(name);
		}
		
		//使用增强for循环进行遍历
		for(String name:book){
			System.out.println(name);
		}
		System.out.println("*********************");
		book.add(1, "历史");//插入到指定下标
		for(String name:book){
			System.out.println(name);
		}
		System.out.println(book.contains("数学"));//找到返回true找不到返回false
		System.out.println(book.get(3));//返回指定下标元素
		System.out.println(book.indexOf("历史"));//找到返回下标找不到返回-1
		book.clear();//清除所有容器元素
		System.out.println(book.isEmpty());//如果容器里面没有元素则返回true

	}

}
