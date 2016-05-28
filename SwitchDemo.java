import java.util.Scanner;
public class SwitchDemo{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入您要抽奖的号码");
		int award = input.nextInt();
		switch(award){
			case 6:
				System.out.println("一等奖");
				break;
			case 8:
				System.out.println("二等奖");
				break;
			case 15:
				System.out.println("三等奖");
				break;
			case 88:
				System.out.println("特等奖");
				break;
			default :
				System.out.println("谢谢光临");
		}
		
		
	}
}