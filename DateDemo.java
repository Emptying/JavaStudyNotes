import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
public class DateDemo{
	public static void main(String [] args){
		Date date = new Date();
		System.out.println(date);//以默认格式输出日期时间 如 Tue Mar 29 11:52:30 CST 2016
		System.out.println(date.getTime());// 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数
		date.setTime(1459223550222L);
		System.out.println(date);
		DateFormat da1 = null;
		DateFormat da2 = null;
		DateFormat da3 = null;
		DateFormat da4 = null;
		da1 = DateFormat.getDateInstance();//创建一个日期对象
		da2 = DateFormat.getDateTimeInstance();//创建一个时间对象
		da3 = DateFormat.getDateInstance(DateFormat.FULL,new Locale("zh","CN"));
		da4 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,new Locale("zh","CN"));
		System.out.println("Date"+da1.format(date));
		System.out.println("DateTime"+da2.format(date));
		System.out.println(da3.format(date));
		System.out.println(da4.format(date));
	}
}