public class ExceptionDemo2{
	public static void main(String [] args){
		Internet inter = new Internet();

		//inter.in(15);
		
		/*try{
			inter.in2(15);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}*/
		try{
			inter.in3(15);
		}catch(AgelessthanEighteenException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}

class Internet{
	
	
	//ʹ�÷��ܲ��쳣
	public void in(int age){
		if(age<18){
			throw new IllegalArgumentException("δ��18��");//���ܲ��쳣���Բ���throws�����Ͳ���
		}else{
			System.out.println("��ӭ����");
		}
	}
	//ʹ���ܲ��쳣
	public void in2 (int age)throws Exception{
		if(age<18){
			throw new Exception("δ��18zhou��");//�ܲ��쳣���������������Ͳ���
		}else{
			System.out.println("��ӭ����");
		}
		
	}
	//ʹ���Զ����쳣
	
	public void in3(int age)throws AgelessthanEighteenException{
		if(age<18){
			throw new AgelessthanEighteenException("δ��18zhou��");//�ܲ��쳣���������������Ͳ���
		}else{
			System.out.println("��ӭ����");
		}		
	}
}

//�Զ����쳣

class AgelessthanEighteenException extends Exception{
	private String Message;
	public AgelessthanEighteenException(String Message){
		this.Message=Message;
	}
	
	public String getMessage(){
		return Message;
	}
}