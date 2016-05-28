package com.empty.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionApiDemo {

	public static void main(String[] args)throws Exception {
		/*获取Person类所关联的对象
		 * 
		 * */
		Class<?> classtype = Class.forName("com.empty.reflection.Person");
		//通过反射机制来构造一个Person的实例对象（默认调用无参的构造方法）
		//Person person=(Person)classtype.newInstance();//默认是Object类所以要强制类型转换
		
		
		/*获取指定的构造方法(无参数构造方法)分两步
		 * 
		 * */
		
		//1.返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。
		//Constructor<?> constructor=classtype.getConstructor(new Class<?>[]{});
		//2.实例化构造方法
		//Person person=(Person)constructor.newInstance(new Object[]{});//默认是Object类所以要强制类型转换
		
		/*获取指定构造方法（带参数）
		 * 
		 * */
		//1.获取构造方法参数传的是Person相应构造方法里参数的基本数据类型，Person(String,int)
		Constructor<?> constructor=classtype.getConstructor(new Class<?>[]{String.class,int.class});
		//2.构造方法获取到了接下来就是实例化构造方法，传入的参数就是相应构造方法所需的参数
		Person person=(Person)constructor.newInstance(new Object[]{"张三",23});
		System.out.println(person);
		
		//获取所有方法
		Method [] methods=classtype.getDeclaredMethods();
		for(Method method:methods){
			System.out.println(method.getName()+method.getReturnType());
		}
		
		
		
		//获取指定方法包括私有;getDeclaredMethod("方法名",方法参数的基本数据类型)
/*		Method method=classtype.getDeclaredMethod("toString", new Class<?>[]{});
		
		//方法获取到了接下来就是调用方法拉，通过invoke来调用;invoke("对象名",方法所需的参数)
		String string=(String)method.invoke(person, new Object[]{});
		System.out.println(string);*/
		
		//获取私有方法（结论默认不可被调用）解决方法调用setAccessible
		Method method=classtype.getDeclaredMethod("eat", new Class<?>[]{});
		method.setAccessible(true);
		//方法获取到了接下来就是调用方法拉，通过invoke来调用;invoke("对象名",方法所需的参数)
		method.invoke(person, new Object[]{});
		
		
		//获取对象的属性包括私有
		Field field=classtype.getDeclaredField("name");//获取指定对象
		field.setAccessible(true);//设置可访问
		field.set(person, "李四");//设置参数set("对象名",属性的值)
		System.out.println(field.get(person));//获取这个属性的值
		
	}

}

class Person{
	private String name;
	private int age;
	public Person(){
		System.out.println("默认调用无参构造方法");
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	private void eat(){
		System.out.println("Eating。。。");
	}
	
}