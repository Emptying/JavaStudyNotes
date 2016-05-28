package com.ploy.animal;
/*
多态的三个重要特点

*/

public class Animal{
	public static void main(String [] args){
		//3.父类可以引用子类的对象
		AnimalDemo animal1 = new Dog("癞皮狗",9);//向上转型,子类对象转向父类引用变量  dog -> animal
		//向上转型是安全的但可能导致子类的方法丢失
		//如 animal1.Bite();//这个咬人的方法就不能用
		System.out.println(animal1);
		animal1.eat();
		AnimalDemo animal2 = new Cat("加菲猫",8);
		System.out.println(animal2);
		animal2.eat();
		//向下转型是不安全的
		//Cat cat = (Cat)animal1;//运行会报错 java.lang.ClassCastException 类型转换异常
		//通过 instanceof来判断是否符合
		if (animal1 instanceof Cat){
			Cat cat = (Cat)animal1;
			System.out.println("anima1 -> cat");
		}
		if(animal1 instanceof Dog){
			Dog dog = (Dog)animal1;
			//类型转换后就可以调用Dog的特有方法
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
	//通用方法没有意义
	//告诉子类要去实现它
	public void eat(){
		System.out.println("吃");
	}
	public String getName(){
		return Name;
	}
	public int getAge(){
		return Age;
	}
}

//1.继承
class Dog extends AnimalDemo{
	public Dog(String Name,int Age){
		super(Name,Age);
	}
	//2.方法重写
	public void eat(){
		System.out.println("啃骨头");
	}
	public void Bite(){
		System.out.println("咬人");
	}
	
	public String toString(){
		return "名字："+getName()+"年龄："+getAge()+"岁";
	}
}
class Cat extends AnimalDemo{
	public Cat(String Name,int Age){
		super(Name,Age);
	}
	public void eat(){
		System.out.println("吃鱼");
	}
		public String toString(){
		return "名字："+getName()+"年龄："+getAge()+"岁";
	}
	
}