package com.empty.synchronizedtest;


public class BankDemo2 {

	public static void main(String[] args) {
		Bank2 bank = new Bank2();
		
		saveThread saveThread = new saveThread(bank);
		getThread getThread = new getThread(bank);
		
		Thread savethread1 = new Thread(saveThread,"��Ǯ��");

		Thread getthread1 = new Thread(getThread,"ȡǮ��");

		savethread1.start();

		getthread1.start();


	}

}

class saveThread implements Runnable{
	private Bank2 bank = null;
	public saveThread(Bank2 bank){
		this.bank=bank;
	}
	
	@Override
	public void run() {

		for(int i=0;i<10;i++){
			bank.saveMoney(500);
		}

	
	}
	
}

class getThread implements Runnable{
	private Bank2 bank = null;
	
	public getThread(Bank2 bank){
		this.bank=bank;
	}
	@Override
	public void run() {

		for(int i=0;i<10;i++){
			bank.getMoney(300);
		}
		

	}
	
}



class Bank2{
	private int money;
	private boolean status=false;
	
	public synchronized void saveMoney(int money){
		if(status==true){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//ģ���Ǯʱ��
			this.money+=money;
			System.out.println(Thread.currentThread().getName()+"����:"+money+"Ԫ"+"���"+this.money);
			status=true;
			notify();


	}
	
	public synchronized void getMoney(int money){
		if(status==false){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(money>this.money){
			System.out.println(Thread.currentThread().getName()+"����");
		}else{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//ģ��ȡǮʱ��
			this.money-=money;
			System.out.println(Thread.currentThread().getName()+"ȡ��:"+money+"���"+this.money);
			status=false;
			notify();

		}
	}
}