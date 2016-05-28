public class AbstractDemo{
	public static void main(String [] args){
		Teacher T = new Teacher(1,"����",2000.0);
		System.out.println(T);
		T.work();
		
		Dean D = new Dean(2,"����",3000.0,5000.0);
		System.out.println(D);
		D.work();
	}
}
//�����಻��ʵ����
abstract class Employee{
	private int number;//����
	private String name;//����
	private double wage;//нˮ
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
//�̳г��������ȥʵ�����ĳ��󷽷�����Ӧ�ý��ų�����ȥ
class Teacher extends Employee{
	public Teacher(int number,String name,double wage){
		super(number,name,wage);
	}
	public void work(){
		System.out.println("����:����");
	}
	public String toString(){
		return "����:"+getNumber()+" ����:"+getName()+" ����:"+getWage();
	}
}

class Dean extends Employee{
	private double allowance; 
	public Dean(int number,String name,double wage,double allowance){
		super(number,name,wage);
		this.allowance=allowance;
	}
	public void work(){
		System.out.println("����:�ƶ���ѧ�ƻ�");
	}
	public String toString(){
		return "����:"+getNumber()+" ����:"+getName()+" ����:"+getWage()+" ����:"+allowance;
	}
}
