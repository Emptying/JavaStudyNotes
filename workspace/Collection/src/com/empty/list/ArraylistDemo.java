package com.empty.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> book = new ArrayList<>();
		book.add("����");
		book.add("Ӣ��");
		book.add("��ѧ");
		book.set(0, "yuwen");
		
		//ʹ��Iterator����������������
		Iterator<String> it = book.iterator();
		while(it.hasNext()){
			String name=it.next();
			System.out.println(name);
		}
		
		//ʹ����ǿforѭ�����б���
		for(String name:book){
			System.out.println(name);
		}
		System.out.println("*********************");
		book.add(1, "��ʷ");//���뵽ָ���±�
		for(String name:book){
			System.out.println(name);
		}
		System.out.println(book.contains("��ѧ"));//�ҵ�����true�Ҳ�������false
		System.out.println(book.get(3));//����ָ���±�Ԫ��
		System.out.println(book.indexOf("��ʷ"));//�ҵ������±��Ҳ�������-1
		book.clear();//�����������Ԫ��
		System.out.println(book.isEmpty());//�����������û��Ԫ���򷵻�true

	}

}
