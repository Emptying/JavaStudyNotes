public class SplitDemo{
	
	//协议的内容
	private	static int LEN=2;
	private	static String PRIVATE_MSG="pm";
	private	static String SPLIT=",";
		
	
	public static void main(String []args){
		//演示
		String str = "are you ok";
		System.out.println(str.split(" ")[0]);
		System.out.println(str.split(" ")[1]);
		System.out.println(str.split(" ")[2]);
		//例子
		//将一段字符串进行包装分别加上头和尾然后用户名和内容再以协议的分隔符分开
		String str2 = PRIVATE_MSG+"张三"+SPLIT+"你好呀"+PRIVATE_MSG;
		if(str2.startsWith(PRIVATE_MSG)&&str2.endsWith(PRIVATE_MSG)){
			//如果是以私信开头和结尾就进行解析得到内容
			str2=getMsg(str2);
		}
		//内容得到后再进行分割得到用户名和内容
		String user=str2.split(SPLIT)[0];
		String msg=str2.split(SPLIT)[1];
		System.out.println("用户名:"+user+"\n"+"消息:"+msg);
	}
	//去掉头尾
	public static String getMsg(String str){
		return str.substring(LEN,  str.length() - LEN);
	}
}