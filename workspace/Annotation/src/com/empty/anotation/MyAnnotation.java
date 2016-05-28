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


//标记注解
@interface MyAnnotation1{
	
}
enum Color{
	RED,BLACK,GREEND;
}

@interface MyAnnotation2{
//	String name();
	//用value可以直接括号里面给值
	
	//给定默认值的话可以在使用的时候不用赋值
//	String value() default "lisi";
//	//注解里可以有多个成员
//	int age();
	//注解里面使用数组
//	String [] value();
	//使用枚举类型
	Color value();
}







