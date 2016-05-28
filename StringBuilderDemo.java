public class StringBuilderDemo{
	public static void main(String [] args){
		StringBuilder sb = new StringBuilder();//默认容量16
		sb.append("hello");
		sb.append(1);
		sb.append(false);
		System.out.println(sb.length());//当前长度
		System.out.println(sb.capacity());//当前容量
		System.out.println(sb);//输出内容
		
	}
}