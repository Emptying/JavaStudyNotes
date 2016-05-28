public class InnerClass{
	public static void main(String [] args){
		//创建外部类
		Outclass out = new Outclass();
		//创建内部类
		Outclass.Inclass in = out.new Inclass();
		//内部类调用内部类方法
		in.showIn();

		
	}
}

class Outclass{
	private String name = "机器人";
	private int Num = 20;
	public void showOut(){
		System.out.println(name);
		System.out.println(Num);
		//外部类不能直接访问内部类的属性和方法
		//System.out.println(Num2);
		
	}
	
	public class Inclass{
		private String name = "莫干那";
		private int Num2 = 30;
		//内部类不能声明静态属性和方法
		//private static int Num3;
		//内部类声明静态常量
		private static final int Num4 = 5;
		
		public void showIn(){
		
			System.out.println(name);
			System.out.println(Num2);
			//使用外部类属性
			System.out.println(Outclass.this.name);
			//内部类调用外部类方法
			showOut();
		}
	}
}