import java.util.Random;
public class RandomCodes{
	public static void main(String [] args){
		CodesDemo codes = new CodesDemo();
		StringBuilder code = codes.Codes();
		System.out.println("«Î ‰»Î—È÷§¬Î:"+code);
	}
}

class CodesDemo{
	//private String [] sql = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
	
	public StringBuilder Codes(){
		char [] sql = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
		StringBuilder sb = new StringBuilder();
		Random ra = new Random();
		int count = 0;
		while(true){
			//sql[ra.nextInt(36)];
			if(sb.indexOf(sql[ra.nextInt(36)]+"") == -1){
				sb.append(sql[ra.nextInt(36)]);
				count++;
			}
			if(count==4){
				break;
			}
		}
		return sb;
	}
	
	
}