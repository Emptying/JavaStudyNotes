public class SplitDemo{
	
	//Э�������
	private	static int LEN=2;
	private	static String PRIVATE_MSG="pm";
	private	static String SPLIT=",";
		
	
	public static void main(String []args){
		//��ʾ
		String str = "are you ok";
		System.out.println(str.split(" ")[0]);
		System.out.println(str.split(" ")[1]);
		System.out.println(str.split(" ")[2]);
		//����
		//��һ���ַ������а�װ�ֱ����ͷ��βȻ���û�������������Э��ķָ����ֿ�
		String str2 = PRIVATE_MSG+"����"+SPLIT+"���ѽ"+PRIVATE_MSG;
		if(str2.startsWith(PRIVATE_MSG)&&str2.endsWith(PRIVATE_MSG)){
			//�������˽�ſ�ͷ�ͽ�β�ͽ��н����õ�����
			str2=getMsg(str2);
		}
		//���ݵõ����ٽ��зָ�õ��û���������
		String user=str2.split(SPLIT)[0];
		String msg=str2.split(SPLIT)[1];
		System.out.println("�û���:"+user+"\n"+"��Ϣ:"+msg);
	}
	//ȥ��ͷβ
	public static String getMsg(String str){
		return str.substring(LEN,  str.length() - LEN);
	}
}