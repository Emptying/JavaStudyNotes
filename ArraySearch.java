import java.util.Scanner; 
public class ArraySearch{
	public static void main(String [] args){
		//int [] Number = new int[]{10,23,34,24,27,68,56};
		int [] Number={10,23,34,24,27,68,56};
		int Number2 = -1;
		int Number3 = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("����Ҫ���ҵ���");
		Number3 = input.nextInt();
		
		for(int i = 0;i < Number.length;i++){
			if(Number[i] == Number3){
				Number2 = i+1;
			}
		}
		
		if(Number2!=-1){
			System.out.println("��Ҫ���ҵ����ڵ�"+Number2+"��");
		}else{
			System.out.println("û���ҵ�");
		}
	}
}