package com.ploy.animal;
/*
��̬��������Ҫ�ص�

*/

public class Animal{
	public static void main(String [] args){
		//3.���������������Ķ���
		AnimalDemo animal1 = new Dog("�Ƥ��",9);//����ת��,�������ת�������ñ���  dog -> animal
		//����ת���ǰ�ȫ�ĵ����ܵ�������ķ�����ʧ
		//�� animal1.Bite();//���ҧ�˵ķ����Ͳ�����
		System.out.println(animal1);
		animal1.eat();
		AnimalDemo animal2 = new Cat("�ӷ�è",8);
		System.out.println(animal2);
		animal2.eat();
		//����ת���ǲ���ȫ��
		//Cat cat = (Cat)animal1;//���лᱨ�� java.lang.ClassCastException ����ת���쳣
		//ͨ�� instanceof���ж��Ƿ����
		if (animal1 instanceof Cat){
			Cat cat = (Cat)animal1;
			System.out.println("anima1 -> cat");
		}
		if(animal1 instanceof Dog){
			Dog dog = (Dog)animal1;
			//����ת����Ϳ��Ե���Dog�����з���
			dog.Bite();
			System.out.println("animal1 -> dog");
		}
		
		
	}
}
class AnimalDemo{
	private String Name;
	private int Age;
	public AnimalDemo(String Name,int Age){
		this.Name=Name;
		this.Age=Age;
	}
	//ͨ�÷���û������
	//��������Ҫȥʵ����
	public void eat(){
		System.out.println("��");
	}
	public String getName(){
		return Name;
	}
	public int getAge(){
		return Age;
	}
}

//1.�̳�
class Dog extends AnimalDemo{
	public Dog(String Name,int Age){
		super(Name,Age);
	}
	//2.������д
	public void eat(){
		System.out.println("�й�ͷ");
	}
	public void Bite(){
		System.out.println("ҧ��");
	}
	
	public String toString(){
		return "���֣�"+getName()+"���䣺"+getAge()+"��";
	}
}
class Cat extends AnimalDemo{
	public Cat(String Name,int Age){
		super(Name,Age);
	}
	public void eat(){
		System.out.println("����");
	}
		public String toString(){
		return "���֣�"+getName()+"���䣺"+getAge()+"��";
	}
	
}