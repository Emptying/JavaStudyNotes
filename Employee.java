public class Employee{
	public String Name;
	public int age;
	
	public String toString(){
		return "�ҵ����ֽ�"+Name+"\n"+"�ҽ���"+age+"��";
	}
	
	public int Count(String raw,String Find){
		int index = raw.indexOf(Find);
		int count = 0;
		while(index != -1){
			count++;
			index = raw.indexOf(Find,index+1);
		}	
		return count;
	}
	
	public static void main(String [] args){
		Employee E = new Employee();
		E.Name = "�׾�";
		E.age = 65;
		String raw = "����С��һС��note����С��4cС���ഺ��";
		String Find = "С��";
		System.out.println(E.toString());
		System.out.println(Find+"���ֵĴ�����"+E.Count(raw,Find));
	
			
	}
}