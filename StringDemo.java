public class StringDemo{
	public static void main(String [] args){
		String content = "HELLO FUCK TO LE";
		System.out.println(content.charAt(6));//�����Ӧ�ַ����±��ֵ
		System.out.println(content.compareTo("hello"));//��������ַ����Ƚ�
		content=content.concat("shit");//��������ַ������ӵ�����棻
		System.out.println(content);
		boolean str = content.endsWith("shit");//�ж��ַ����Ľ�β�Ƿ����������������Ϊtrue�������Ϊfalse��
		System.out.println(str);
		boolean str2 = content.startsWith("HELLO");//�ж��ַ����Ŀ�ʼ�Ƿ����������������Ϊtrue�������Ϊfalse��
		System.out.println(str2);  
		boolean str3 = content.contains("FUCK");//�����ַ����е�ֵ���ڷ���true�����ڷ���flase��
		System.out.println(str3);
		String [] array= content.split(" ");
		BubbleSort M = new BubbleSort();
		M.Arrayprint(array);
	}
}