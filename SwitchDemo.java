import java.util.Scanner;
public class SwitchDemo{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��������Ҫ�齱�ĺ���");
		int award = input.nextInt();
		switch(award){
			case 6:
				System.out.println("һ�Ƚ�");
				break;
			case 8:
				System.out.println("���Ƚ�");
				break;
			case 15:
				System.out.println("���Ƚ�");
				break;
			case 88:
				System.out.println("�صȽ�");
				break;
			default :
				System.out.println("лл����");
		}
		
		
	}
}