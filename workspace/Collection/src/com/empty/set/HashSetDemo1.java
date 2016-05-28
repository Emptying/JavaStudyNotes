package com.empty.set;

import java.util.HashSet;


public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set容器不允许出现相同
		HashSet<String> book = new HashSet<>();

		book.add("语文");
		book.add("英语");
		book.add("数学");
		book.add("语文");
		System.out.println(book.size());
		
		

	}

}
