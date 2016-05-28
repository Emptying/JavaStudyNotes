package com.empty.otherio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectInputOutputDemo{

	public static void main(String[] args)throws IOException {
		//���л�����
		Student student = new Student("����", 18);//�½�����
		FileOutputStream fos = new FileOutputStream("D:/test.stu");//����洢�ļ�
		ObjectOutputStream oos = new ObjectOutputStream(fos);//��װ�����ļ�
		oos.writeObject(student);//����������ʽд����󵽶����ļ�
		oos.close();
		//�����л�����
		FileInputStream fis = new FileInputStream("D:/test.stu");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			Student stu=(Student)ois.readObject();
			ois.close();
			System.out.println(stu);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
//Ҫ���л��������ʵ��Serializable�ӿ�

class Student implements Serializable{
	/**
	 * ���кͷ������Ǹ���serialVersionUID
	 */
	private static final long serialVersionUID = -2288728297039227595L;
	private String name;
	private int age;
	public Student(String name, int age) {
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
