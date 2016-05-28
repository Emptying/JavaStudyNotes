public class Demo2{
	public static void main(String [] args){
		Mytest<Dog> dog = new Mytest<>(new Dog());
		dog.getData().eat();
		Mytest<Cat> cat = new Mytest<>(new Cat());
		cat.getData().eat();
		//Mytest<String> str = new Mytest<>();//错误: 类型参数String不在类型变量T的范围内
		Mytest2<Dog2> dog2 = new Mytest2<>(new Dog2());
		dog2.getData().eat();
		Mytest2<Cat2> cat2 = new Mytest2<>(new Cat2());
		cat2.getData().eat();
		//无边界限定通配符
		Mytest2<?> test =null; 
		test = dog2;
		test.getData().eat();
		//上边界限定通配符
		//Mytest2<? extends Animal2>
		//下边界限定通配符
		//Mytest2<? super Dog2>
		
		
		
	}
}

//指定接收参数类型的泛型
class Mytest<T extends Animal>{
	private T data;
	public Mytest(){
		
	}
	
	public Mytest(T data){
		this.data = data;
	}
	
	public T getData(){
		return data;
	}
}

//可以指定接口类型和抽象类型
class Mytest2<T extends Animal2>{
	private T data;
	public Mytest2(){
		
	}
	
	public Mytest2(T data){
		this.data = data;
	}
	
	public T getData(){
		return data;
	}
}

//接口类型
interface Animal2{
	public abstract void eat();
}


//抽象类型
abstract class Animal{
	public abstract void eat();
}

class Dog extends Animal{
	public void eat(){
		System.out.println("啃骨头");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("吃鱼肉");
	}
}

class Dog2 implements Animal2{
	public void eat(){
		System.out.println("啃骨头");
	}
}

class Cat2 implements Animal2{
	public void eat(){
		System.out.println("吃鱼肉");
	}
}