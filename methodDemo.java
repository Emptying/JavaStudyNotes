public class methodDemo{
	public void method1(){
		System.out.println("�޲����޷���ֵ�ķ���");
	}
	
	public String method2(){
		return "�޲����з���ֵ����";
	}
	
	public void method3(int Number){
		System.out.println("�в����޷���ֵ��������Ϊ"+Number);
	}
	
	public String method4(String Name,int Number){
		return "�з���ֵ�в����Ҳ���Ϊ"+Name+Number;
	}
	//���ݻ�����������
	public void basicData(int data){
		data++;
		System.out.println(data);
	}
	//����������������
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