public class Demo2{
	public static void main(String [] args){
		Mytest<Dog> dog = new Mytest<>(new Dog());
		dog.getData().eat();
		Mytest<Cat> cat = new Mytest<>(new Cat());
		cat.getData().eat();
		//Mytest<String> str = new Mytest<>();//����: ���Ͳ���String�������ͱ���T�ķ�Χ��
		Mytest2<Dog2> dog2 = new Mytest2<>(new Dog2());
		dog2.getData().eat();
		Mytest2<Cat2> cat2 = new Mytest2<>(new Cat2());
		cat2.getData().eat();
		//�ޱ߽��޶�ͨ���
		Mytest2<?> test =null; 
		test = dog2;
		test.getData().eat();
		//�ϱ߽��޶�ͨ���
		//Mytest2<? extends Animal2>
		//�±߽��޶�ͨ���
		//Mytest2<? super Dog2>
		
		
		
	}
}

//ָ�����ղ������͵ķ���
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

//����ָ���ӿ����ͺͳ�������
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

//�ӿ�����
interface Animal2{
	public abstract void eat();
}


//��������
abstract class Animal{
	public abstract void eat();
}

class Dog extends Animal{
	public void eat(){
		System.out.println("�й�ͷ");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("������");
	}
}

class Dog2 implements Animal2{
	public void eat(){
		System.out.println("�й�ͷ");
	}
}

class Cat2 implements Animal2{
	public void eat(){
		System.out.println("������");
	}
}