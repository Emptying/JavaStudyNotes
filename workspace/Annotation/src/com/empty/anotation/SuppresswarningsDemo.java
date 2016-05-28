package com.empty.anotation;

public class SuppresswarningsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//使用@SuppressWarnings("unchecked") 压制警告
@SuppressWarnings("unchecked")
class Container<T>{
	Object [] obj = null;
	public Container(){
		obj=new Object[100];
	}
	
	public T[] toArrays(){
		return (T[])obj; 
	}
}
