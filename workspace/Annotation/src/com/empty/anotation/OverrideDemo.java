package com.empty.anotation;

public class OverrideDemo {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
	}

}

class Animal{
	public void eat(){
		System.out.println("��ʲô");
	}
}

class Dog extends Animal{
	//����@override�ͷ�ֹ��д���෽��ʱ����������
	@Override
	public void eat(){
		System.out.println("��ʺ");
	}
}