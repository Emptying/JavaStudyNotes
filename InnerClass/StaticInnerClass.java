public class StaticInnerClass{
	public static void main(String [] args){
		//�ڲ���̬��ʵ��
		OutClass.InnerClass inner = new OutClass.InnerClass();
		inner.showNum2();
	}
}

class OutClass{
	private int num = 5;
	private static int num3 = 10;
	//�ⲿ������ڲ��Ǿ�̬��Ա��ʵ������
	
	InnerClass inner = new InnerClass();
	
	public void showNum(){
		System.out.println(num);
		System.out.println(inner.num2);
	}
	
	public static class InnerClass{
		private int num2  = 6;
		public void showNum2(){
			System.out.println(num2);
			//����ʹ���ⲿ��Ǿ�̬����
			//System.out.println(num);
			//�����ⲿ�ྲ̬����
			System.out.println(OutClass.num3);
		}
		
	} 
}