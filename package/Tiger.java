package com.demo.animal;
public class Tiger{
	public static void main(String [] args){
		Meat tiger = new Meat();
		tiger.setName("�ϻ�");
		tiger.setAge(9);
		tiger.setArea("����");
		tiger.ShowName();
		tiger.ShowAge();
		tiger.ShowArea();
		tiger.Eat(tiger.Behavior);
		tiger.Run();
	}
	/*public Tiger(){
		super();
	}*/
	
	
}