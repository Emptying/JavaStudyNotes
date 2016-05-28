package com.empty.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person("zhangsan", 18));
		persons.add(new Person("lisi", 17));
		persons.add(new Person("wangwu", 20));
		persons.add(new Person("haoliu", 20));
		persons.add(new Person("cws", 23));
		Collections.sort(persons,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				//使用String里的compareTo方法按字典顺序比较
				int gName = o1.getName().compareTo(o2.getName());
				int gAge = o1.getAge()-o2.getAge();
				if(gAge>0){
					return 1;
				}else if(gAge < 0 ){
					return -1;
				}else if(gAge==0){
					return gName;
				}
				return 0;
			}
		});
		
		for(Person out:persons){
			System.out.println(out.getName()+"==="+out.getAge());
		}

	}

}
class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	
	
}
