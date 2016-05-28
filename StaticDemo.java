public class StaticDemo{
	public static void main(String [] args){
		Demo D = new Demo();
		D.showNumber();
		Demo.showNumber2();//静态方法可以直接用类名.方法名调用
		Demo.Number2++;//静态变量可以直接类名.变量名调用；
	}
}

class Demo{

	private int Number = 1;
	public static int Number2 = 2;//声明一个静态变量
	public Demo(){
		System.out.println("无参构造方法");
	}
	static{
		Number2++;
		System.out.println("静态变量初始化方法在构造方法之前");
	}
	
	public void showNumber(){
		System.out.println(Number);
		System.out.println(Number2);//非静态方法可以使用静态变量
	}
	
	public static void showNumber2(){
		System.out.println(Number2);
		//System.out.println(Number);//静态方法不能使用静态变量；

	}
}