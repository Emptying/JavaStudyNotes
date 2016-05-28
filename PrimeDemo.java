//输出100~200之间的素数

public class PrimeDemo{
	public static void main(String [] args){
		for(int i = 100;i<=200;i++){
			boolean flage = true;
			for(int j = 2;j<i;j++){
				if(i%j==0){
					flage=false;
					break;
				}
			}
			if(flage){
					System.out.println(i);
				}
		}
	}
}