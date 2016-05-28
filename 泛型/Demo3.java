public class Demo3{
	public static void main(String [] args){
		Demo D = new Demo();
		D.print("hello");
		D.print(false);
		D.print(123);
		D.print(12.12);
		D.print(new Dog());
		D.print(new Cat());
	}
}


class Demo{
	//���ͷ���
	public <T> void print(T data){
		System.out.println(data);
	}
	
	//���ͷ�������
	public <T extends Animal> void print(T data){
		data.eat();
	} 
}

interface Animal{
	public void eat();
}

class Dog implements Animal{
	public void eat(){
		System.out.println("�й�ͷ");
	}
}

class Cat implements Animal{
	public void eat(){
		System.out.println("������");
	}
}