public class Struct{
	public static void main(String [] args){
		structDemo S = new structDemo("张三",23,"福建福州");
		System.out.println(S.toString());
	}
}

class structDemo{
	private String Name;
	private int Age;
	private String City;
	
	public structDemo(){
		System.out.println("无参构造方法");
	}
	public structDemo(String Name,int Age,String City){
		this(); //必须放在第一条
		this.Name=Name;
		if(Age<25){
			System.out.println("年龄太小默认25");
			this.Age=25;
		}else{
			this.Age=Age;
		}
		
		this.City=City;
	}
	public String toString(){
		return "姓名是"+Name+"年龄是"+Age+"岁"+"住在"+City;
	}
}