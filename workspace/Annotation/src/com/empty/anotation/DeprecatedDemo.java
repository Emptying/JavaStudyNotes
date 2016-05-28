package com.empty.anotation;

public class DeprecatedDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.show();
	}

}

class Person{
	//加上Deprecated 用来提示程序员这个类或者方法已经过时
	
	@Deprecated
	public void show(){
		System.out.println("显示个人信息");
	}
}
