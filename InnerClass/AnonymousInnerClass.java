public class AnonymousInnerClass{
	public static void main(String [] args){
		Person P = new Person();
		//Dog dog = new Dog();
		//P.Fes(dog);
		
		//ͨ��������ʵ��
		P.Fes(new Animal(){
			public void eat(){
				System.out.println("�й�ͷ");
			}
		});
	}
}

class Person{
	
	public void Fes(Animal animal){
		animal.eat();
	}
}

abstract class Animal{
	public abstract void eat();
}
//����ʵ��
/*class Dog extends Animal{
	public void eat(){
		System.out.println("�й�ͷ");
	}
}*/