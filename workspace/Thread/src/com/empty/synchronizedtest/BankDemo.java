package com.empty.synchronizedtest;

public class BankDemo {

	public static void main(String[] args) {
		BankTherad bankTherad = new BankTherad();
		Thread thread1 = new Thread(bankTherad,"�ڴ���");
		Thread thread2 = new Thread(bankTherad,"��ATM��");
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
			System.out.println(Thread.currentThread().getName()+"ȡ��:"+res);
		}else{
			System.out.println("����");
		}
	}
	
}


class Bank{
	private int money = 500;
	
	//��һ���߳�ȥ����synchronizedͬ��������ʱ������߳̾ͻ�ȡ�˵�ǰ�������
	//����߳���ִ�е�ʱ�������̵߳ȴ�ֻ�еȵ�ǰ�߳��ͷŶ���������ܽ���ȥִ��
	public synchronized int getMoney(int money){
		if(money>this.money){
			return -1;
		}else{
			
			try {
				Thread.sleep(1000);//ģ��ȴ�ȡǮʱ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.money=this.money-money;
			System.out.println("ȡ��"+money+"(���"+this.money+")");
		}
		return money;
	}
}