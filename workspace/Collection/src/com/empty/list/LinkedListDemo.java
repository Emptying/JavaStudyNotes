package com.empty.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> book = new LinkedList<>();
		book.add("yuwen");
		book.add("shuxue");
		book.add("yingyu");
		System.out.println(book.getFirst());//���ش��б�ĵ�һ��Ԫ��
		System.out.println(book.getLast());//���ش��б�����һ��Ԫ��
		book.offer("lishi");
		System.out.println(book.getLast());//���ش��б�����һ��Ԫ��
		System.out.println(book.peek());
		System.out.println(book.poll());
		System.out.println(book.peek());
		System.out.println("**********************");
//		System.out.println(str);
		
		

	}

}
