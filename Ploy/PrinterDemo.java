public class PrinterDemo{
	public static void main(String [] args){
		ColorPrinter Cp = new ColorPrinter("����");
		BlackPrinter Bp = new BlackPrinter("������");
		School school = new School();
		school.setPrinter(Cp);
		school.print("����ʦ����ѧ");
		school.setPrinter(Bp);
		school.print("����ʦ����ѧ");
	}
}

class Printer{
	private String Brands;
	public Printer(String Brands){
		this.Brands=Brands;
	}
	public void print(String content){
		
	}
	public String getBrands(){
		return Brands;
	}
}

class School{
	private Printer P=null;
	public void setPrinter(Printer P){
		this.P=P;
	}
	public void print(String content){
		P.print(content);
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

