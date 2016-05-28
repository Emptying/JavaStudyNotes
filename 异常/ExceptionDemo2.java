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
	
	
	//使用非受查异常
	public void in(int age){
		if(age<18){
			throw new IllegalArgumentException("未满18岁");//非受查异常可以不用throws声明和捕获
		}else{
			System.out.println("欢迎光临");
		}
	}
	//使用受查异常
	public void in2 (int age)throws Exception{
		if(age<18){
			throw new Exception("未满18zhou岁");//受查异常必须对其进行声明和捕获
		}else{
			System.out.println("欢迎光临");
		}
		
	}
	//使用自定义异常
	
	public void in3(int age)throws AgelessthanEighteenException{
		if(age<18){
			throw new AgelessthanEighteenException("未满18zhou岁");//受查异常必须对其进行声明和捕获
		}else{
			System.out.println("欢迎光临");
		}		
	}
}

//自定义异常

class AgelessthanEighteenException extends Exception{
	private String Message;
	public AgelessthanEighteenException(String Message){
		this.Message=Message;
	}
	
	public String getMessage(){
		return Message;
	}
}