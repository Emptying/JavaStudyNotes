import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionDemo{
	public static void main(String [] args){
		System.out.println("请输入一个数");
		int sum = 0;
		Scanner input = new Scanner(System.in);
		try{
			int num = input.nextInt();
			sum = 10/num;			
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/*catch(ArithmeticException e){
			System.out.println(e.getMessage());//返回错误信息
			e.printStackTrace();//返回堆栈异常信息
			
		}catch(InputMismatchException e){
			System.out.println(e.getMessage());//返回错误信息
			e.printStackTrace();//返回堆栈异常信息
		}*/
		
		//不管有没有异常finally都会去执行，如关闭打开的文件删除一些临时文件等
		finally{
			System.out.println("结果是"+sum);
		}

		
	}
}