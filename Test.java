import java.util.Random;
import java.util.Scanner;
public class Test{
	
	public static void main(String [] args){
		Random ra =new Random();
		Scanner input = new Scanner(System.in);
		
		for(int i = 0 ;i<30;i++){
			String tmp = input.next();
			int num = ra.nextInt(100)+1;
			System.out.print("����������:");
			System.out.println(num);
			
		}
	} 
}