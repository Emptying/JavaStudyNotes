public class StringDemo{
	public static void main(String [] args){
		String content = "HELLO FUCK TO LE";
		System.out.println(content.charAt(6));//输出相应字符串下标的值
		System.out.println(content.compareTo("hello"));//与输入的字符串比较
		content=content.concat("shit");//把输入的字符串链接到最后面；
		System.out.println(content);
		boolean str = content.endsWith("shit");//判断字符串的结尾是否与输入的相符，相符为true，不相符为false；
		System.out.println(str);
		boolean str2 = content.startsWith("HELLO");//判断字符串的开始是否与输入的相符，相符为true，不相符为false；
		System.out.println(str2);  
		boolean str3 = content.contains("FUCK");//搜索字符串中的值存在返回true不存在返回flase；
		System.out.println(str3);
		String [] array= content.split(" ");
		BubbleSort M = new BubbleSort();
		M.Arrayprint(array);
	}
}