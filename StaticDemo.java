public class StaticDemo{
	public static void main(String [] args){
		Demo D = new Demo();
		D.showNumber();
		Demo.showNumber2();//��̬��������ֱ��������.����������
		Demo.Number2++;//��̬��������ֱ������.���������ã�
	}
}

class Demo{

	private int Number = 1;
	public static int Number2 = 2;//����һ����̬����
	public Demo(){
		System.out.println("�޲ι��췽��");
	}
	static{
		Number2++;
		System.out.println("��̬������ʼ�������ڹ��췽��֮ǰ");
	}
	
	public void showNumber(){
		System.out.println(Number);
		System.out.println(Number2);//�Ǿ�̬��������ʹ�þ�̬����
	}
	
	public static void showNumber2(){
		System.out.println(Number2);
		//System.out.println(Number);//��̬��������ʹ�þ�̬������

	}
}