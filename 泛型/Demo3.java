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
	//泛型方法
	public <T> void print(T data){
		System.out.println(data);
	}
	
	//泛型方法重载
	public <T extends Animal> void print(T data){
		data.eat();
	} 
}

interface Animal{
	public void eat();
}

class Dog implements Animal{
	public void eat(){
		System.out.println("啃骨头");
	}
}

class Cat implements Animal{
	public void eat(){
		System.out.println("吃鱼肉");
	}
}