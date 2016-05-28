package com.empty.synchronizedtest;

public class BankDemo {

	public static void main(String[] args) {
		BankTherad bankTherad = new BankTherad();
		Thread thread1 = new Thread(bankTherad,"在窗口");
		Thread thread2 = new Thread(bankTherad,"在ATM机");
		thread1.start();
		thread2.start();
	}

}
class BankTherad implements Runnable{
	
	Bank bank =new Bank();

	@Override
	public void run() {
		int res = bank.getMoney(400);
		if(res>0){
			System.out.println(Thread.currentThread().getName()+"取出:"+res);
		}else{
			System.out.println("余额不足");
		}
	}
	
}


class Bank{
	private int money = 500;
	
	//当一个线程去调用synchronized同步方法的时候，这个线程就获取了当前对象的锁
	//这个线程在执行的时候其他线程等待只有等当前线程释放对象的锁才能接下去执行
	public synchronized int getMoney(int money){
		if(money>this.money){
			return -1;
		}else{
			
			try {
				Thread.sleep(1000);//模拟等待取钱时间
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.money=this.money-money;
			System.out.println("取出"+money+"(余额"+this.money+")");
		}
		return money;
	}
}