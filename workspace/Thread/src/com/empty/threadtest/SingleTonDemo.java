package com.empty.threadtest;

public class SingleTonDemo {

	public static void main(String[] args) {
		SingleTomTherad singleTomTherad = new SingleTomTherad();
		Thread thread1 = new Thread(singleTomTherad);
		Thread thread2 = new Thread(singleTomTherad);
		thread1.start();
		thread2.start();
	}

}

//单模式线程问题解决

class SingleTomTherad implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		SingleTon.getInstance();
	}
	
}

class SingleTon{
	private static SingleTon singleTon= null;
	private SingleTon(){
		System.out.println("单例模式");
	}
	public static SingleTon getInstance(){
		if(singleTon==null){
			synchronized (SingleTon.class) {
				if(singleTon==null){
					singleTon=new SingleTon();
				}
			}
		}

		return singleTon;
	}
}
