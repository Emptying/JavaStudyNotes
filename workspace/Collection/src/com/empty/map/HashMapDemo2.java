package com.empty.map;

import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Long,Student> stu = new HashMap<>();
		Student st1=new Student("zhangsan", 18);
		stu.put(120352013015L,st1);
		stu.put(120352013016L,new Student("lisi", 28));
		stu.put(120352013017L,new Student("wangwu", 13));
		stu.put(120352013018L,new Student("zhaoli", 16));
		stu.put(120352013019L,new Student("zhangsan", 18));
		System.out.println(stu.size());
		//通过value 查找对应的key
		for(Long key:stu.keySet()){
			if(stu.get(key)==st1){
				System.out.println("学号是"+key);
			}
		}

	}

}

class Student{
	private String name;
	private int age;
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
