public class StaticInnerClass{
	public static void main(String [] args){
		//内部静态类实例
		OutClass.InnerClass inner = new OutClass.InnerClass();
		inner.showNum2();
	}
}

class OutClass{
	private int num = 5;
	private static int num3 = 10;
	//外部类访问内部非静态成员先实例对象
	
	InnerClass inner = new InnerClass();
	
	public void showNum(){
		System.out.println(num);
		System.out.println(inner.num2);
	}
	
	public static class InnerClass{
		private int num2  = 6;
		public void showNum2(){
			System.out.println(num2);
			//不能使用外部类非静态属性
			//System.out.println(num);
			//访问外部类静态属性
			System.out.println(OutClass.num3);
		}
		
	} 
}