public class Teacher{
	public static void main(String [] args){
		teach T = new teach();
		T.setName("���");
		System.out.println(T.toName());
		T.setAge(23);
		System.out.println(T.toAge());
	}
}

class teach{
	private String Name;//����
	private int age;//����
	public void setName(String SName){
		Name=SName;
	}
	public void setAge(int Sage){
		if(Sage<25){
			System.out.println("�����������С��25��Ĭ��25");
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