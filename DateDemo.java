import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
public class DateDemo{
	public static void main(String [] args){
		Date date = new Date();
		System.out.println(date);//��Ĭ�ϸ�ʽ�������ʱ�� �� Tue Mar 29 11:52:30 CST 2016
		System.out.println(date.getTime());// ������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ�����
		date.setTime(1459223550222L);
		System.out.println(date);
		DateFormat da1 = null;
		DateFormat da2 = null;
		DateFormat da3 = null;
		DateFormat da4 = null;
		da1 = DateFormat.getDateInstance();//����һ�����ڶ���
		da2 = DateFormat.getDateTimeInstance();//����һ��ʱ�����
		da3 = DateFormat.getDateInstance(DateFormat.FULL,new Locale("zh","CN"));
		da4 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,new Locale("zh","CN"));
		System.out.println("Date"+da1.format(date));
		System.out.println("DateTime"+da2.format(date));
		System.out.println(da3.format(date));
		System.out.println(da4.format(date));
	}
}