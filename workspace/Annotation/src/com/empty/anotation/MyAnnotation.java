package com.empty.anotation;

public class MyAnnotation {
//	@MyAnnotation2(name="zhangsan")
//	@MyAnnotation2(value="zhangsan",age=10)
//	@MyAnnotation2({"zhang","lisi"})
	@MyAnnotation2(Color.RED)
	public MyAnnotation() {
		
	}
	
	
	@MyAnnotation1
	public static void main(String[] args) {
		
	}

}


//���ע��
@interface MyAnnotation1{
	
}
enum Color{
	RED,BLACK,GREEND;
}

@interface MyAnnotation2{
//	String name();
	//��value����ֱ�����������ֵ
	
	//����Ĭ��ֵ�Ļ�������ʹ�õ�ʱ���ø�ֵ
//	String value() default "lisi";
//	//ע��������ж����Ա
//	int age();
	//ע������ʹ������
//	String [] value();
	//ʹ��ö������
	Color value();
}







