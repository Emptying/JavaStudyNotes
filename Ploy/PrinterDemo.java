public class PrinterDemo{
	public static void main(String [] args){
		ColorPrinter Cp = new ColorPrinter("惠普");
		BlackPrinter Bp = new BlackPrinter("爱普生");
		School school = new School();
		school.setPrinter(Cp);
		school.print("福建师范大学");
		school.setPrinter(Bp);
		school.print("福建师范大学");
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

