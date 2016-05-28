package com.empty.classtype;

public class ClassDemo {

	public static void main(String[] args) {
		//第一种获取方式 对象名.getCalss
/*		Person person = new Person("zhangsan", 18);
		Class <?> classtype =person.getClass();
		System.out.println(classtype.getName());
		System.out.println(classtype.getSuperclass().getName());*/
		
		//第二种 类名.class
/*		Class <?> classtype=Person.class;
		System.out.println(classtype.getName());
		System.out.println(classtype.getSuperclass().getName());*/
		
		//第三种使用Class.forName("");
		
		try {
			Class <?> classtype=Class.forName("com.empty.classtype.Person");
			System.out.println(classtype.getName());
			System.out.println(classtype.getSuperclass().getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
