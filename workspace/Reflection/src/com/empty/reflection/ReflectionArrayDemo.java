package com.empty.reflection;

import java.lang.reflect.Array;

public class ReflectionArrayDemo {

	public static void main(String[] args) throws Exception {
		//通过反射机制构造一个String类型的一维数组
		//Class<?>classtype=Class.forName("java.lang.String");//获取String这个类
		//Object array=Array.newInstance(String.class/*classtype*/, 5);//创建一个String类型指定容量为5的一维数组
	//	Array.set(array, 2, "abc");//设置这个数组指定下标的值
	//	System.out.println(Array.get(array, 2));//获取这个数组指定下标的值
		
		//通过反射机制构造一个String类型二维数组
		Object array=Array.newInstance(String.class/*classtype*/,new int[]{3,3});//创建一个三行三列的二维数组
		//先获取行数
		Object row=Array.get(array, 2);//第三行，0.1.2
		Array.set(row, 1, "abc");//设置第三行第二列的值
		String[][]arr=(String [][])array;//类型转换
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		 
		
		
		
		
		
		
	}

}
