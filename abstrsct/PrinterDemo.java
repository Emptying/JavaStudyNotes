public class PrinterDemo{
	public static void main(String [] args){
		ColorPrinter Cp = new ColorPrinter("����");
		BlackPrinter Bp = new BlackPrinter("������");
		School school = new School();
		Teacher T = new Teacher("����",10);
		school.setPrinter(Cp);//���ô�ӡ��
		school.print(T);
	}
}
interface IInfo{
	String content(); 
}
//��ӡ������
class Printer{
	private String Brands;//���ô�ӡ��Ʒ��
	//���췽�� 
	public Printer(String Brands){
		this.Brands=Brands;
	}
	//������ȥʵ���������
	public void print(String content){
		
	}
	//���Ʒ������
	public String getBrands(){
		return Brands;
	}
}

class School implements IInfo{
	
	private Printer P=null;
	//���մ�ӡ������
	public void setPrinter(Printer P){
		this.P=P;
	}
	//��ӡ�ӿ����� ֻҪ�Խӿڷ������¸�д�ľͿ��Դ�ӡ
	public void print(IInfo Info){
		P.print(Info.content());
	}
	//
	public String content(){
		return "����ʦ����ѧ";
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
		return "�ҵ����ֽ�:"+name+"�ҽ���"+age+"��";
	}
}

class ColorPrinter extends Printer{
	public ColorPrinter(String Brands){
		super(Brands);
	}
	public void print(String Brands){
		System.out.println(getBrands()+"��ɫ��ӡ��"+Brands);
	}
}

class BlackPrinter extends Printer{
	public BlackPrinter(String Brands){
		super(Brands);
	}
	public void print(String Brands){
		System.out.println(getBrands()+"�ڰ״�ӡ��"+Brands);
	}
}

