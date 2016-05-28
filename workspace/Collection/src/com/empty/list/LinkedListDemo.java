package com.empty.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> book = new LinkedList<>();
		book.add("yuwen");
		book.add("shuxue");
		book.add("yingyu");
		System.out.println(book.getFirst());//返回此列表的第一个元素
		System.out.println(book.getLast());//返回此列表的最后一个元素
		book.offer("lishi");
		System.out.println(book.getLast());//返回此列表的最后一个元素
		System.out.println(book.peek());
		System.out.println(book.poll());
		System.out.println(book.peek());
		System.out.println("**********************");
//		System.out.println(str);
		
		

	}

}
