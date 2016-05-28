public class FactoryDemo{
	public static void main(String [] args){
		Pick pick = Factory.pickget("梨");//实例化返回的对象
		//如果有返回的对象就调用get方法打印输出对象的内容
		if(pick!=null){
			System.out.println(pick.get());
		}else{
			System.out.println("没有相应的水果");
		}
	}
}
//工厂类
class Factory{
	//静态方法 方便类名.方法名调用
	public static Pick pickget(String name){
		if(name.equals("苹果")){
			return new Apple();
		}else if(name.equals("梨")){
			return new Pear();
		}else {
			return null;
		}
	}
}
//采摘接口
interface Pick{
	public String get();
}

class Apple implements Pick{
	public String get(){
		return "摘苹果";
	}
	
}

class Pear implements Pick{
	public String get(){
		return "摘梨";
	}
	
}