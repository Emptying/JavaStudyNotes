package com.empty.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionApiDemo {

	public static void main(String[] args)throws Exception {
		/*��ȡPerson���������Ķ���
		 * 
		 * */
		Class<?> classtype = Class.forName("com.empty.reflection.Person");
		//ͨ���������������һ��Person��ʵ������Ĭ�ϵ����޲εĹ��췽����
		//Person person=(Person)classtype.newInstance();//Ĭ����Object������Ҫǿ������ת��
		
		
		/*��ȡָ���Ĺ��췽��(�޲������췽��)������
		 * 
		 * */
		
		//1.����һ�� Constructor ��������ӳ�� Class ��������ʾ�����ָ���������췽����
		//Constructor<?> constructor=classtype.getConstructor(new Class<?>[]{});
		//2.ʵ�������췽��
		//Person person=(Person)constructor.newInstance(new Object[]{});//Ĭ����Object������Ҫǿ������ת��
		
		/*��ȡָ�����췽������������
		 * 
		 * */
		//1.��ȡ���췽������������Person��Ӧ���췽��������Ļ����������ͣ�Person(String,int)
		Constructor<?> constructor=classtype.getConstructor(new Class<?>[]{String.class,int.class});
		//2.���췽����ȡ���˽���������ʵ�������췽��������Ĳ���������Ӧ���췽������Ĳ���
		Person person=(Person)constructor.newInstance(new Object[]{"����",23});
		System.out.println(person);
		
		//��ȡ���з���
		Method [] methods=classtype.getDeclaredMethods();
		for(Method method:methods){
			System.out.println(method.getName()+method.getReturnType());
		}
		
		
		
		//��ȡָ����������˽��;getDeclaredMethod("������",���������Ļ�����������)
/*		Method method=classtype.getDeclaredMethod("toString", new Class<?>[]{});
		
		//������ȡ���˽��������ǵ��÷�������ͨ��invoke������;invoke("������",��������Ĳ���)
		String string=(String)method.invoke(person, new Object[]{});
		System.out.println(string);*/
		
		//��ȡ˽�з���������Ĭ�ϲ��ɱ����ã������������setAccessible
		Method method=classtype.getDeclaredMethod("eat", new Class<?>[]{});
		method.setAccessible(true);
		//������ȡ���˽��������ǵ��÷�������ͨ��invoke������;invoke("������",��������Ĳ���)
		method.invoke(person, new Object[]{});
		
		
		//��ȡ��������԰���˽��
		Field field=classtype.getDeclaredField("name");//��ȡָ������
		field.setAccessible(true);//���ÿɷ���
		field.set(person, "����");//���ò���set("������",���Ե�ֵ)
		System.out.println(field.get(person));//��ȡ������Ե�ֵ
		
	}

}

class Person{
	private String name;
	private int age;
	public Person(){
		System.out.println("Ĭ�ϵ����޲ι��췽��");
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
		System.out.println("Eating������");
	}
	
}