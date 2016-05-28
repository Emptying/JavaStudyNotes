public class AnonymousInnerClass{
	public static void main(String [] args){
		Person P = new Person();
		//Dog dog = new Dog();
		//P.Fes(dog);
		
		//通过匿名类实现
		P.Fes(new Animal(){
			public void eat(){
				System.out.println("啃骨头");
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
//常规实现
/*class Dog extends Animal{
	public void eat(){
		System.out.println("啃骨头");
	}
}*/