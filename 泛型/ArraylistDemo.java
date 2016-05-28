import java.util.Arrays;

public class ArraylistDemo{
	public static void main(String [] args){
		ArrayList<String> data = new ArrayList<>();//新建一个默认大小的容器
		for(int i = 0;i<18;i++){
			data.Add("你好");
		}
		for(int i = 0;i<data.Size();i++){
			System.out.println(data.getData(i));
		}
		
		System.out.println(data.getSize());
	}
}

/*

开发一个容器
功能1.add添加
功能2.get获取
功能3.获取大小size
功能4.自动扩容

*/
interface Icontainer <T>{
	public void Add(T data);
	public Object getData(int num);
	public String getSize();
	public int Size();
}


class ArrayList <T> implements Icontainer<T>{
	private Object [] obj = null;
	private int count = 0;
	//默认容器大小
	public ArrayList(){
		obj = new Object[16];
	}
	
	//指定容器大小
	public ArrayList(int num){
		obj = new Object[num];
	}
	//添加
	public void Add(T data){
		count++;
		Expansion(count);
		for (int i=0;i<obj.length;i++){
			if(obj[i]==null){
				obj[i]=data;
				break;
			}
		}
	}
	//扩容
	private void Expansion(int size){
		if(size > obj.length){
			int oldlength = obj.length;
			int newlength = oldlength*2;
			obj=Arrays.copyOf(obj,newlength);
		}
	}
	//获取
	public Object getData(int num){
		return obj[num];
	}
	//获取大小信息
	public int Size(){
		return count;
	}
	//输出容量信息
	public String getSize(){
		return "当前总容量"+obj.length+"已用"+count;
	}
	
}

