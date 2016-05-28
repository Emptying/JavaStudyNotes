public class PrinterDemo{
	public static void main(String [] args){
		ColorPrinter Cp = new ColorPrinter("惠普");
		BlackPrinter Bp = new BlackPrinter("爱普生");
		School school = new School();
		Teacher T = new Teacher("张三",10);
		school.setPrinter(Cp);//设置打印机
		school.print(T);
	}
}
interface IInfo{
	String content(); 
}
//打印机父类
class Printer{
	private String Brands;//设置打印机品牌
	//构造方法 
	public Printer(String Brands){
		this.Brands=Brands;
	}
	//让子类去实现这个方法
	public void print(String content){
		
	}
	//输出品牌名称
	public String getBrands(){
		return Brands;
	}
}

class School implements IInfo{
	
	private Printer P=null;
	//接收打印机类型
	public void setPrinter(Printer P){
		this.P=P;
	}
	//打印接口内容 只要对接口方法重新改写的就可以打印
	public void print(IInfo Info){
		P.print(Info.content());
	}
	//
	public String content(){
		return "福建师范大学";
	}
}

class Teacher implements IInfo{
	private String name;
	private int age;
	public Teacher(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String content(){
		return "我的名字叫:"+name+"我今年"+age+"岁";
	}
}

class ColorPrinter extends Printer{
	public ColorPrinter(String Brands){
		super(Brands);
	}
	public void print(String Brands){
		System.out.println(getBrands()+"彩色打印："+Brands);
	}
}

class BlackPrinter extends Printer{
	public BlackPrinter(String Brands){
		super(Brands);
	}
	public void print(String Brands){
		System.out.println(getBrands()+"黑白打印："+Brands);
	}
}

