/*
关键字

接口定义  interface

接口调用 implements 


*/


public class Interface{
	public static void main(String [] args){
		//System.out.println(Number);
		Person person = new Person();
		Dog dog =new Dog();
		Child child = new Child();
		person.Action(dog);
		person.Action(child);
	}
}
//接口命名规范前面加I
//接口只能声明公开静态常量
//接口只能放抽象方法
interface Iability{
	/*
		默认加上 （public static final） int Number = 1;
		默认加上（public abstract） void show();
	*/
	void eat();
}
class Person{
	/*public void Action(Child child){
		child.eat();
	}
	public void Action (Dog dog){
		dog.eat();
	}*/
	//接口实现了多态
	public void Action(Iability ability){
		ability.eat();
	}
	
}

class Dog implements Iability{
	public void eat(){
		System.out.println("啃骨头");
	}
}

class Child implements Iability{
	public void eat(){
		System.out.println("吃饭");
	}	
}