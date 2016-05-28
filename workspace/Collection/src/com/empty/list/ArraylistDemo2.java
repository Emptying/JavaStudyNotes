package com.empty.list;

import java.util.ArrayList;

public class ArraylistDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stu =  new ArrayList<>();
		stu.add(new Student("zhangsan", 18));
		stu.add(new Student("ÀîËÄ", 20));
		stu.add(new Student("wangwu", 25));
		for(Student st:stu){
			System.out.println(st);
		}
		

	}

}


class Student{
	private String name;
	private int age;
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	
	public String toString(){
		return "Name is :"+name+"  Age is :"+age;
	}
}