/*
�ؼ���

�ӿڶ���  interface

�ӿڵ��� implements 


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
//�ӿ������淶ǰ���I
//�ӿ�ֻ������������̬����
//�ӿ�ֻ�ܷų��󷽷�
interface Iability{
	/*
		Ĭ�ϼ��� ��public static final�� int Number = 1;
		Ĭ�ϼ��ϣ�public abstract�� void show();
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
	//�ӿ�ʵ���˶�̬
	public void Action(Iability ability){
		ability.eat();
	}
	
}

class Dog implements Iability{
	public void eat(){
		System.out.println("�й�ͷ");
	}
}

class Child implements Iability{
	public void eat(){
		System.out.println("�Է�");
	}	
}