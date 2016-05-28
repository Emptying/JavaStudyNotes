import java.util.Scanner; 
public class ArraySearch{
	public static void main(String [] args){
		//int [] Number = new int[]{10,23,34,24,27,68,56};
		int [] Number={10,23,34,24,27,68,56};
		int Number2 = -1;
		int Number3 = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("输入要查找的数");
		Number3 = input.nextInt();
		
		for(int i = 0;i < Number.length;i++){
			if(Number[i] == Number3){
				Number2 = i+1;
			}
		}
		
		if(Number2!=-1){
			System.out.println("你要查找的数在第"+Number2+"个");
		}else{
			System.out.println("没有找到");
		}
	}
}