import java.util.Scanner;
public class WhileDemo{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数字");
		int number = input.nextInt();
		while(number!=0){
			int res = number%10;
			System.out.print(res);
			number/=10;
		}
	}
	
}