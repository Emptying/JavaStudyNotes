public class ForDemo2{
	public static void main(String [] args){
		System.out.println("1000以内能同时被3和7整除的数有:");
		for(int i=1;i<=1000;i++){
			if(i%3==0&&i%7==0){
				System.out.println(i);
			}
		}
	}
}