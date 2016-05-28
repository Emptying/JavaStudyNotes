public class EnumDemo{
	public static void main(String [] args){
		
		//所以可以直接通过类名.对象名来调用
		System.out.println(Color.RED);
		
		//获取枚举类型的值
		Color [] co  =  Color.values();//values这个方法在enum的api文档找不到其实他是在其实现的子类ElementType中实现的
		//增强型for循环
		for(Color c:co){
			System.out.println(c);
		}
		System.out.println("*****************************************");
		//带参数的枚举
		
		Person [] persons =  Person.values();
		for(Person P:persons){
			System.out.println(P);
		}
		
	}
}
//当你去调用枚举类型它等同于
//做了 public static final  Color RED = new Color();
//做了 public static final  Color BLUE = new Color();
//做了 public static final  Color GREAN = new Color();


enum Color{
	//默认都是静态常量
	
	RED,BLUE,GREAN;//枚举类型的值必须最为第一条语句出现
	
	private Color(){
		System.out.println("枚举类型的构造方法是私有的");//我们构建了三个对象因此构造方法被执行了三次
	}
	

}

enum Person{
	//当构建P3相当于 public static final Person P3 = new Person("cws",23);
	//这就是带参数的构造方法
	
	P1,P2,P3("cws",23),P4("zmc",22);
	
	private String name;
	private int age;
	//构造器默认执行
	private Person(){
		System.out.println("默认无参构造器");
	}
	//带参数构造器
	private Person(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("带参数的构造器");
	}
	//重写toString
	
	public String toString(){
		return "名字:"+name+"年龄"+age;
	}
}