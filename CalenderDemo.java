import java.util.Scanner;
public class CalenderDemo{
	public static void main(String [] args){
		int year;
		int mouth;
		int day=0;
		int totalDay=0;
		int logTemp=0;
		boolean isRun;
		Scanner input=new Scanner(System.in);
		System.out.println("************欢迎使用万年历*************");
		System.out.println("请输入年份");
		year = input.nextInt();
		System.out.println("请输入月份");
		mouth = input.nextInt();
		if((year%4==0)||(year%400==0)&&year%100!=0){
			isRun = true;
		}else{
			isRun = false;
		}
		if(isRun==true){
			System.out.println( year + "年是闰年" );
		}else{
			System.out.println( year + "年是非闰年" );
		}
		//计算年的总天数
		for(int i=1900;i<year;i++){
			if(i%400==0||(i%4==0&&i%100!=0)){
				totalDay+=366;
			}else{
				totalDay+=365;
			}
		}
		System.out.println("LOG year totalDay="+totalDay);
		//计算月份的总天数
		for(int i=1;i<=mouth;i++){
			switch(i){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					day = 31;
					break;
				case 2:
					if(isRun){
						day = 29;
					}else{
						day = 28;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					day = 30;
					break;
				default :
				System.out.println("月份输入错误");	
			}
			//当月不累加
			if(i!=mouth){
				totalDay+=day;
				logTemp+=day;
			}
			
		}
		System.out.println("LOG mouth totalDay="+logTemp);
		System.out.println("LOG year totalDay + mouth totalDay="+totalDay);
		
		//求当前月份一号是星期几
		int beforeDay;
		beforeDay=1+totalDay%7;  //神奇公式
		System.out.println("LOG beforeDay=1+totalDay%7="+beforeDay);
		System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		//星期日为第一天打印 \t 为0
		if(beforeDay==7){
			beforeDay=0;
		}
		//打印\t的次数
		for(int i=0;i<beforeDay;i++){
			System.out.print("\t");
		}
		//打印当前月份天数
		
		for(int i=1;i<=day;i++){
			System.out.print(i+"\t");
			//每七天换行包括\t
			if((i+beforeDay)%7==0){
				System.out.println();
			}
		}
		
	}	
}