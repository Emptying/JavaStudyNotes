import java.util.Scanner;
public class IfDemo{
	public static void main(String [] args){
		int key=50;
		int key1=30;
		int tem;
		/*if(key>key1){
			tem=key;
		}else{
			tem=key1;
		}
		System.out.println(tem);*/
		tem=(key>key1)?key:key1;
		System.out.println(tem);
		//С��Ŀ
		Scanner input=new Scanner(System.in);
		System.out.println("������żٵ�����");
		int day=input.nextInt();
		if(day>5){
			System.out.println("ȥ������");
		}else if(day>3){
			System.out.println("ȥ����");
		}else{
			System.out.println("�ڼ���Ϣ");
		}
		Scanner input2=new Scanner(System.in);
		
		input2.nextInt();
		
	}
}