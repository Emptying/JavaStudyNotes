package com.empty.anotation;

public class DeprecatedDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.show();
	}

}

class Person{
	//����Deprecated ������ʾ����Ա�������߷����Ѿ���ʱ
	
	@Deprecated
	public void show(){
		System.out.println("��ʾ������Ϣ");
	}
}
