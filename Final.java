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
	public final int a = 10;//����һ������
	 
	public void Showa(){
		//a++; //�������ܱ��޸�
		System.out.println(a);
	}
}