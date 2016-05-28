package com.empty.threadtest;

public class RunnableDemo {

	public static void main(String[] args) {
		MyRunnable T = new MyRunnable();
		Thread thread1 =new Thread(T,"线程1");
		Thread thread2 =new Thread(T,"线程2");
		thread1.start();
		thread2.start();
	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}
