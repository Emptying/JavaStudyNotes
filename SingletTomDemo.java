public class SingletTomDemo{
	public static void main(String [] args){
		SingleTom S=SingleTom.getsing();
		SingleTom D=SingleTom.getsing();
		SingleTom.getsing();

	}
}

class SingleTom{
	private SingleTom(){
		System.out.println("singleTom");//���췽��
	}
	
	private static SingleTom singletom = null;//����һ��˽�о�̬����
	
	public static SingleTom getsing(){      //��̬���������ⲿ������.����������
		if(singletom==null){
			singletom = new SingleTom();
		}
		return singletom;
	}
	
}