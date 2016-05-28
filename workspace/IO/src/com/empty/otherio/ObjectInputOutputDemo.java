package com.empty.otherio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectInputOutputDemo{

	public static void main(String[] args)throws IOException {
		//序列化对象
		Student student = new Student("张三", 18);//新建对象
		FileOutputStream fos = new FileOutputStream("D:/test.stu");//对象存储文件
		ObjectOutputStream oos = new ObjectOutputStream(fos);//包装对象文件
		oos.writeObject(student);//以特殊编码格式写入对象到对象文件
		oos.close();
		//反序列化对象
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
//要序列化对象必须实现Serializable接口

class Student implements Serializable{
	/**
	 * 序列和反序列是根据serialVersionUID
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
