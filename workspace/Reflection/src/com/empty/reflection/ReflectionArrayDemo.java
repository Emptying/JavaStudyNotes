package com.empty.reflection;

import java.lang.reflect.Array;

public class ReflectionArrayDemo {

	public static void main(String[] args) throws Exception {
		//ͨ��������ƹ���һ��String���͵�һά����
		//Class<?>classtype=Class.forName("java.lang.String");//��ȡString�����
		//Object array=Array.newInstance(String.class/*classtype*/, 5);//����һ��String����ָ������Ϊ5��һά����
	//	Array.set(array, 2, "abc");//�����������ָ���±��ֵ
	//	System.out.println(Array.get(array, 2));//��ȡ�������ָ���±��ֵ
		
		//ͨ��������ƹ���һ��String���Ͷ�ά����
		Object array=Array.newInstance(String.class/*classtype*/,new int[]{3,3});//����һ���������еĶ�ά����
		//�Ȼ�ȡ����
		Object row=Array.get(array, 2);//�����У�0.1.2
		Array.set(row, 1, "abc");//���õ����еڶ��е�ֵ
		String[][]arr=(String [][])array;//����ת��
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		 
		
		
		
		
		
		
	}

}
