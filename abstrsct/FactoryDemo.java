public class FactoryDemo{
	public static void main(String [] args){
		Pick pick = Factory.pickget("��");//ʵ�������صĶ���
		//����з��صĶ���͵���get������ӡ������������
		if(pick!=null){
			System.out.println(pick.get());
		}else{
			System.out.println("û����Ӧ��ˮ��");
		}
	}
}
//������
class Factory{
	//��̬���� ��������.����������
	public static Pick pickget(String name){
		if(name.equals("ƻ��")){
			return new Apple();
		}else if(name.equals("��")){
			return new Pear();
		}else {
			return null;
		}
	}
}
//��ժ�ӿ�
interface Pick{
	public String get();
}

class Apple implements Pick{
	public String get(){
		return "ժƻ��";
	}
	
}

class Pear implements Pick{
	public String get(){
		return "ժ��";
	}
	
}