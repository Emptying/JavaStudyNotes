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
		System.out.println("����"+Name);
	}
	public void ShowAge(){
		System.out.println("����"+Age+"��");
	}
	public void ShowArea(){
		System.out.println("����"+Area);
	}
	public void Eat(String food){
		System.out.println("��"+food);
	}
	public void Run(){
		System.out.println("��");
	}
	
}



