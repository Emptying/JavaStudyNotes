package com.empty.classtype;

import java.lang.reflect.Constructor;

public class CopyStudent {

	public static void main(String[] args) throws Exception{
		//��ʽһ
		
		Class<?> classtype=Class.forName("com.empty.classtype.Student");//��ȡ����
		Student student=(Student)classtype.newInstance();//ʵ��Ĭ���޲�
		student.setName("����");
		student.setAge(19);
		System.out.println(student.getName()+student.getAge());
		
		//��ʽ��
		//��ȡָ�����������췽��
		Constructor<?> constructor = classtype.getDeclaredConstructor(new Class<?>[]{String.class,int.class});
		Student student2=(Student)constructor.newInstance(new Object[]{"����",19});
		System.out.println(student2.getName()+student2.getAge());
		
		//��ʽ��
		//��ȡָ���޲�
		Student student3=(Student)classtype.getDeclaredConstructor(new Class<?>[]{}).newInstance(new Object[]{});
		student3.setName("����");
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
		return "����:"+name+":"+"����"+age+"��";
	}
	
	
	
	
	
	
	
	
}
