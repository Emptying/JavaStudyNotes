public class InnerClass{
	public static void main(String [] args){
		//�����ⲿ��
		Outclass out = new Outclass();
		//�����ڲ���
		Outclass.Inclass in = out.new Inclass();
		//�ڲ�������ڲ��෽��
		in.showIn();

		
	}
}

class Outclass{
	private String name = "������";
	private int Num = 20;
	public void showOut(){
		System.out.println(name);
		System.out.println(Num);
		//�ⲿ�಻��ֱ�ӷ����ڲ�������Ժͷ���
		//System.out.println(Num2);
		
	}
	
	public class Inclass{
		private String name = "Ī����";
		private int Num2 = 30;
		//�ڲ��಻��������̬���Ժͷ���
		//private static int Num3;
		//�ڲ���������̬����
		private static final int Num4 = 5;
		
		public void showIn(){
		
			System.out.println(name);
			System.out.println(Num2);
			//ʹ���ⲿ������
			System.out.println(Outclass.this.name);
			//�ڲ�������ⲿ�෽��
			showOut();
		}
	}
}