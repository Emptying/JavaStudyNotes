import java.util.Scanner;
public class WhileDemo{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ������");
		int number = input.nextInt();
		while(number!=0){
			int res = number%10;
			System.out.print(res);
			number/=10;
		}
	}
	
}