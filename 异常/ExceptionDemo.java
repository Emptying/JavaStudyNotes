import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionDemo{
	public static void main(String [] args){
		System.out.println("������һ����");
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
			System.out.println(e.getMessage());//���ش�����Ϣ
			e.printStackTrace();//���ض�ջ�쳣��Ϣ
			
		}catch(InputMismatchException e){
			System.out.println(e.getMessage());//���ش�����Ϣ
			e.printStackTrace();//���ض�ջ�쳣��Ϣ
		}*/
		
		//������û���쳣finally����ȥִ�У���رմ򿪵��ļ�ɾ��һЩ��ʱ�ļ���
		finally{
			System.out.println("�����"+sum);
		}

		
	}
}