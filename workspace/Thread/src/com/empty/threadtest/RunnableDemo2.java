package com.empty.threadtest;

public class RunnableDemo2 {

	public static void main(String[] args) {
		TicketThread ticketThread = new TicketThread();
		Thread thread1 = new Thread(ticketThread,"һ�Ŵ���");
		Thread thread2 = new Thread(ticketThread,"���Ŵ���");
		Thread thread3 = new Thread(ticketThread,"���Ŵ���");
		Thread thread4 = new Thread(ticketThread,"�ĺŴ���");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
//ģ�������ڹ�Ʊ

class TicketThread implements Runnable{
	private int ticket=100;
	@Override
	public void run() {
		while(true){
			synchronized (this) {
				if(ticket<1){
					break;
				}
				ticket--;
				System.out.println(Thread.currentThread().getName()+":"+ticket);

			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}