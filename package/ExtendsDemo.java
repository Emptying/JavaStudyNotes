package com.demo.animal;
class ExtendsDemo{
	private String Name;
	private int Age;
	private String Area;
	public void setArea(String Area){
		this.Area=Area;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public void setAge(int Age){
		this.Age=Age;
	}
	public void ShowName(){
		System.out.println("名字"+Name);
	}
	public void ShowAge(){
		System.out.println("年龄"+Age+"岁");
	}
	public void ShowArea(){
		System.out.println("地区"+Area);
	}
	public void Eat(String food){
		System.out.println("吃"+food);
	}
	public void Run(){
		System.out.println("走");
	}
	
}



