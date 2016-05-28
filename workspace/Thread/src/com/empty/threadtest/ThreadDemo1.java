package com.empty.threadtest;

public class ThreadDemo1 {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread("线程1");
		MyThread thread2 = new MyThread("线程2");
		thread1.start();
		thread2.start();
	}

}

class MyThread extends Thread{
	//调用父类的构造方法
	public MyThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int i= 0;i<5;i++){
			System.out.println(getName()+":"+i);
		}

	}
}
