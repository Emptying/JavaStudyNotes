public class EnumDemo{
	public static void main(String [] args){
		
		//���Կ���ֱ��ͨ������.������������
		System.out.println(Color.RED);
		
		//��ȡö�����͵�ֵ
		Color [] co  =  Color.values();//values���������enum��api�ĵ��Ҳ�����ʵ��������ʵ�ֵ�����ElementType��ʵ�ֵ�
		//��ǿ��forѭ��
		for(Color c:co){
			System.out.println(c);
		}
		System.out.println("*****************************************");
		//��������ö��
		
		Person [] persons =  Person.values();
		for(Person P:persons){
			System.out.println(P);
		}
		
	}
}
//����ȥ����ö����������ͬ��
//���� public static final  Color RED = new Color();
//���� public static final  Color BLUE = new Color();
//���� public static final  Color GREAN = new Color();


enum Color{
	//Ĭ�϶��Ǿ�̬����
	
	RED,BLUE,GREAN;//ö�����͵�ֵ������Ϊ��һ��������
	
	private Color(){
		System.out.println("ö�����͵Ĺ��췽����˽�е�");//���ǹ���������������˹��췽����ִ��������
	}
	

}

enum Person{
	//������P3�൱�� public static final Person P3 = new Person("cws",23);
	//����Ǵ������Ĺ��췽��
	
	P1,P2,P3("cws",23),P4("zmc",22);
	
	private String name;
	private int age;
	//������Ĭ��ִ��
	private Person(){
		System.out.println("Ĭ���޲ι�����");
	}
	//������������
	private Person(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("�������Ĺ�����");
	}
	//��дtoString
	
	public String toString(){
		return "����:"+name+"����"+age;
	}
}