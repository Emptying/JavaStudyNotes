public class Employee{
	public String Name;
	public int age;
	
	public String toString(){
		return "我的名字叫"+Name+"\n"+"我今年"+age+"岁";
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
		E.Name = "雷军";
		E.age = 65;
		String raw = "我有小米一小米note红米小米4c小米青春版";
		String Find = "小米";
		System.out.println(E.toString());
		System.out.println(Find+"出现的次数是"+E.Count(raw,Find));
	
			
	}
}