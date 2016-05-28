public class Teacher{
	public static void main(String [] args){
		teach T = new teach();
		T.setName("麦克");
		System.out.println(T.toName());
		T.setAge(23);
		System.out.println(T.toAge());
	}
}

class teach{
	private String Name;//名字
	private int age;//年龄
	public void setName(String SName){
		Name=SName;
	}
	public void setAge(int Sage){
		if(Sage<25){
			System.out.println("你输入的年龄小于25将默认25");
			age = 25;
		}else{
			age = Sage;
		}
		
	}
	public String toName(){
		return Name;
	}
	public int toAge(){
		return age;
	}
}