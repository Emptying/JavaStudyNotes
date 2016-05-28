public class methodDemo{
	public void method1(){
		System.out.println("无参数无返回值的方法");
	}
	
	public String method2(){
		return "无参数有返回值方法";
	}
	
	public void method3(int Number){
		System.out.println("有参数无返回值方法参数为"+Number);
	}
	
	public String method4(String Name,int Number){
		return "有返回值有参数且参数为"+Name+Number;
	}
	//传递基本数据类型
	public void basicData(int data){
		data++;
		System.out.println(data);
	}
	//传递引用数据类型
	public void ArrayData(int [] array){
		array[1]=99;
		System.out.println(array[1]);
	}
	
	public static void main(String [] args){
		methodDemo M = new methodDemo();
		M.method1();
		System.out.println(M.method2());
		M.method3(23);
		String str = M.method4("fuck",23);
		System.out.println(str);
		int data = 955;
		M.basicData(data);
		System.out.println(data);
		int [] array = {1,2,3,4,5};
		M.ArrayData(array);
		System.out.println(array[1]);
	}
}