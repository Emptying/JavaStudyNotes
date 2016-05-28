public class Demo1{
	public static void main(String[] args){
		//接受字符串类型
		Mytest<String> test = new Mytest<>("张三");
		System.out.println(test.getTset());
		//接收整型
		Mytest<Integer> test2 = new Mytest<>(10);
		System.out.println(test2.getTset());
		//接收自定义类型
		Mytest<Student> test3 = new Mytest<>();
		test3.setTest(new Student());
		test3.getTset().setName("zhangsan");
		System.out.println(test3.getTset());
		//接收泛型
		Mytest<Mytest<Student>> test5 = new Mytest<>();
		Mytest<Student> test4 = new Mytest<>();
		test4.setTest(new Student("张三"));
		test5.setTest(test4);
		System.out.println(test5.getTset().getTset());
		//接收两个参数的泛型
		Mytest2<String,Integer> test6 = new Mytest2<>("李四",10); 
		System.out.println(test6.getData1()+test6.getData2());
		
	}
}
class Mytest <T>{
	private T test;
	public Mytest(){
		
	}
	
	public Mytest(T test){
		this.test = test;
	}
	
	public void setTest(T test){
		this.test = test;
	}
	
	public T getTset(){
		return test;
	}
}

//一个泛型类设置多个类型参数

class Mytest2 <T1,T2>{
	private T1 data1;
	private T2 data2;
	public Mytest2(T1 data1,T2 data2){
		this.data1 = data1;
		this.data2 = data2;
	}
	public T1 getData1(){
		return data1;
	}
	public T2 getData2(){
		return data2;
	}
}

class Student{
	private String name;
	public Student (){
		
	}
	public Student(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String toString(){
		return "My name is:"+name;
	} 
}
