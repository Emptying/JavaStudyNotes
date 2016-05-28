 package com.empty.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Person, String> tdata = new TreeMap<>(/*2.*/new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
/*				if(o1.getAge()-o2.getAge()>0){
					return 1;
				}else if(o1.getAge()-o2.getAge()<0){
					return -1;
				}*/
				int gname = o1.getName().compareTo(o2.getName());
				int gage = o1.getAge()-o2.getAge();
				
				if(gname<0){
					return -1;
				}else if(gname>0){
					return 1;
				}else if(gname==0){
					if(gage>0){
						return 1;
					}else if(gage<0){
						return -1;
					}
					
				}
				
				return 0;
			}
		});
		tdata.put(new Person("zhangsan", 15), "����");
		tdata.put(new Person("lisi", 12), "����");
		tdata.put(new Person("wangwu", 17), "����");
		tdata.put(new Person("zhaoliu", 11), "����");
		tdata.put(new Person("zhaoliu", 14), "����");
		System.out.println(tdata);
		//�׳�java.lang.ClassCastException�쳣
		//��ΪĬ�ϱȽ�����ʽ��ʵ��Comparable�ӿڵ�
		//String �� Integer ��ʵ����Comparable�ӿ� ��ϸ��API
		//����Ҫ�벻�������1.ʵ��Comparable�ӿ���дcompareTo����
		//2.����TreeMap��ʱ��ʵ��TreeMap(Comparator<? super K> comparator)
		

	}

}

class Person/*1.ʵ��Comparable*/ /*implements Comparable<Person>*/{
	private String name;
	private int age;
	
	
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
/*	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(this.age>o.getAge()){
			return 1;
		}else if(this.age < o.getAge()){
			return -1;
		}
		return 0;
	}
	*/
	
}
