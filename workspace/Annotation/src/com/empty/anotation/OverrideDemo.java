package com.empty.anotation;

public class OverrideDemo {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
	}

}

class Animal{
	public void eat(){
		System.out.println("吃什么");
	}
}

class Dog extends Animal{
	//加上@override就防止重写父类方法时方法名错误
	@Override
	public void eat(){
		System.out.println("吃屎");
	}
}