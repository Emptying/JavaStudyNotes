public class Struct{
	public static void main(String [] args){
		structDemo S = new structDemo("����",23,"��������");
		System.out.println(S.toString());
	}
}

class structDemo{
	private String Name;
	private int Age;
	private String City;
	
	public structDemo(){
		System.out.println("�޲ι��췽��");
	}
	public structDemo(String Name,int Age,String City){
		this(); //������ڵ�һ��
		this.Name=Name;
		if(Age<25){
			System.out.println("����̫СĬ��25");
			this.Age=25;
		}else{
			this.Age=Age;
		}
		
		this.City=City;
	}
	public String toString(){
		return "������"+Name+"������"+Age+"��"+"ס��"+City;
	}
}