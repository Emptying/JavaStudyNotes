public class SingletTomDemo{
	public static void main(String [] args){
		SingleTom S=SingleTom.getsing();
		SingleTom D=SingleTom.getsing();
		SingleTom.getsing();

	}
}

class SingleTom{
	private SingleTom(){
		System.out.println("singleTom");//构造方法
	}
	
	private static SingleTom singletom = null;//构建一个私有静态对象
	
	public static SingleTom getsing(){      //静态方法好让外部用类名.方法名调用
		if(singletom==null){
			singletom = new SingleTom();
		}
		return singletom;
	}
	
}