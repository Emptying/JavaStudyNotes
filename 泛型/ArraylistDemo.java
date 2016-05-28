import java.util.Arrays;

public class ArraylistDemo{
	public static void main(String [] args){
		ArrayList<String> data = new ArrayList<>();//�½�һ��Ĭ�ϴ�С������
		for(int i = 0;i<18;i++){
			data.Add("���");
		}
		for(int i = 0;i<data.Size();i++){
			System.out.println(data.getData(i));
		}
		
		System.out.println(data.getSize());
	}
}

/*

����һ������
����1.add���
����2.get��ȡ
����3.��ȡ��Сsize
����4.�Զ�����

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
	//Ĭ��������С
	public ArrayList(){
		obj = new Object[16];
	}
	
	//ָ��������С
	public ArrayList(int num){
		obj = new Object[num];
	}
	//���
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
	//����
	private void Expansion(int size){
		if(size > obj.length){
			int oldlength = obj.length;
			int newlength = oldlength*2;
			obj=Arrays.copyOf(obj,newlength);
		}
	}
	//��ȡ
	public Object getData(int num){
		return obj[num];
	}
	//��ȡ��С��Ϣ
	public int Size(){
		return count;
	}
	//���������Ϣ
	public String getSize(){
		return "��ǰ������"+obj.length+"����"+count;
	}
	
}

