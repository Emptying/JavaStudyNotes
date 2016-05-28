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
		//小题目
		Scanner input=new Scanner(System.in);
		System.out.println("请输入放假的天数");
		int day=input.nextInt();
		if(day>5){
			System.out.println("去海南玩");
		}else if(day>3){
			System.out.println("去打球");
		}else{
			System.out.println("在家休息");
		}
		Scanner input2=new Scanner(System.in);
		
		input2.nextInt();
		
	}
}