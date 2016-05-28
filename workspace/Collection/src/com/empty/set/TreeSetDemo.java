package com.empty.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//×¢½âÍ¬TreeMap
		TreeSet<Person> persons =  new TreeSet<>();
		persons.add(new Person("zhangsan", 18));
		persons.add(new Person("lisi", 19));
		persons.add(new Person("wangwu", 17));
		persons.add(new Person("zhaoliu", 20));
		
		Iterator<Person> out = persons.iterator();
		while(out.hasNext()){
			Person oPerson=out.next();
			System.out.println(oPerson.getName()+oPerson.getAge());
		}
		
		
		System.out.println(persons);
		

	}

}
class Person implements Comparable<Person>{
	private String name;
	private int age;
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
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		int result = this.age-o.getAge();
		if(result<0){
			return -1;
		}else if(result > 0){
			return 1;
		}
		return 0;
	}


	
}