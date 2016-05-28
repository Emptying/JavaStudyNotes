package com.empty.classtype;

import java.lang.reflect.Constructor;

public class CopyStudent {

	public static void main(String[] args) throws Exception{
		//方式一
		
		Class<?> classtype=Class.forName("com.empty.classtype.Student");//获取到类
		Student student=(Student)classtype.newInstance();//实例默认无参
		student.setName("张三");
		student.setAge(19);
		System.out.println(student.getName()+student.getAge());
		
		//方式二
		//获取指定带参数构造方法
		Constructor<?> constructor = classtype.getDeclaredConstructor(new Class<?>[]{String.class,int.class});
		Student student2=(Student)constructor.newInstance(new Object[]{"张三",19});
		System.out.println(student2.getName()+student2.getAge());
		
		//方式三
		//获取指定无参
		Student student3=(Student)classtype.getDeclaredConstructor(new Class<?>[]{}).newInstance(new Object[]{});
		student3.setName("张三");
		student3.setAge(19);
		System.out.println(student3.getName()+student3.getAge());

		
		
	}

}

class Student{
	private String name;
	private int age;
	public Student(){
		
	}
	
	public Student(String name , int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public String toString(){
		return "名字:"+name+":"+"年龄"+age+"岁";
	}
	
	
	
	
	
	
	
	
}
