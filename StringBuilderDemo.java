public class StringBuilderDemo{
	public static void main(String [] args){
		StringBuilder sb = new StringBuilder();//Ĭ������16
		sb.append("hello");
		sb.append(1);
		sb.append(false);
		System.out.println(sb.length());//��ǰ����
		System.out.println(sb.capacity());//��ǰ����
		System.out.println(sb);//�������
		
	}
}