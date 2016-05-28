public class AbstractDemo{
	public static void main(String [] args){
		Teacher T = new Teacher(1,"张三",2000.0);
		System.out.println(T);
		T.work();
		
		Dean D = new Dean(2,"李四",3000.0,5000.0);
		System.out.println(D);
		D.work();
	}
}
//抽象类不能实例化
abstract class Employee{
	private int number;//工号
	private String name;//名字
	private double wage;//薪水
	public Employee(int number,String name,double wage){
		this.number=number;
		this.name=name;
		this.wage=wage;
	}
	public abstract void work();
	public int getNumber(){
		return number;
	}
	public String getName(){
		return name;
	}
	public double getWage(){
		return wage;
	}
}
//继承抽象类必须去实现它的抽象方法否则应该接着抽象下去
class Teacher extends Employee{
	public Teacher(int number,String name,double wage){
		super(number,name,wage);
	}
	public void work(){
		System.out.println("工作:教书");
	}
	public String toString(){
		return "工号:"+getNumber()+" 姓名:"+getName()+" 工资:"+getWage();
	}
}

class Dean extends Employee{
	private double allowance; 
	public Dean(int number,String name,double wage,double allowance){
		super(number,name,wage);
		this.allowance=allowance;
	}
	public void work(){
		System.out.println("工作:制定教学计划");
	}
	public String toString(){
		return "工号:"+getNumber()+" 姓名:"+getName()+" 工资:"+getWage()+" 津贴:"+allowance;
	}
}
