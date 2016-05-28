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
		tdata.put(new Person("zhangsan", 15), "张三");
		tdata.put(new Person("lisi", 12), "李四");
		tdata.put(new Person("wangwu", 17), "王五");
		tdata.put(new Person("zhaoliu", 11), "赵六");
		tdata.put(new Person("zhaoliu", 14), "赵七");
		System.out.println(tdata);
		//抛出java.lang.ClassCastException异常
		//因为默认比较排序方式是实现Comparable接口的
		//String 和 Integer 都实现了Comparable接口 详细见API
		//所以要想不报错必须1.实现Comparable接口重写compareTo方法
		//2.构造TreeMap的时候实现TreeMap(Comparator<? super K> comparator)
		

	}

}

class Person/*1.实现Comparable*/ /*implements Comparable<Person>*/{
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
