public class Final{
	public static void main(String [] args){
		A a = new A();
		//final A b = newA();
		//b.a=5;
		//b.Showa();
		a.Showa();
	}
}

class A{
	public final int a = 10;//定义一个常量
	 
	public void Showa(){
		//a++; //常量不能被修改
		System.out.println(a);
	}
}