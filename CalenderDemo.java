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
		System.out.println("************��ӭʹ��������*************");
		System.out.println("���������");
		year = input.nextInt();
		System.out.println("�������·�");
		mouth = input.nextInt();
		if((year%4==0)||(year%400==0)&&year%100!=0){
			isRun = true;
		}else{
			isRun = false;
		}
		if(isRun==true){
			System.out.println( year + "��������" );
		}else{
			System.out.println( year + "���Ƿ�����" );
		}
		//�������������
		for(int i=1900;i<year;i++){
			if(i%400==0||(i%4==0&&i%100!=0)){
				totalDay+=366;
			}else{
				totalDay+=365;
			}
		}
		System.out.println("LOG year totalDay="+totalDay);
		//�����·ݵ�������
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
				System.out.println("�·��������");	
			}
			//���²��ۼ�
			if(i!=mouth){
				totalDay+=day;
				logTemp+=day;
			}
			
		}
		System.out.println("LOG mouth totalDay="+logTemp);
		System.out.println("LOG year totalDay + mouth totalDay="+totalDay);
		
		//��ǰ�·�һ�������ڼ�
		int beforeDay;
		beforeDay=1+totalDay%7;  //���湫ʽ
		System.out.println("LOG beforeDay=1+totalDay%7="+beforeDay);
		System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
		//������Ϊ��һ���ӡ \t Ϊ0
		if(beforeDay==7){
			beforeDay=0;
		}
		//��ӡ\t�Ĵ���
		for(int i=0;i<beforeDay;i++){
			System.out.print("\t");
		}
		//��ӡ��ǰ�·�����
		
		for(int i=1;i<=day;i++){
			System.out.print(i+"\t");
			//ÿ���컻�а���\t
			if((i+beforeDay)%7==0){
				System.out.println();
			}
		}
		
	}	
}