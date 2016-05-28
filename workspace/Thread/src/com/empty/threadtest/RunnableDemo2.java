package com.empty.threadtest;

public class RunnableDemo2 {

	public static void main(String[] args) {
		TicketThread ticketThread = new TicketThread();
		Thread thread1 = new Thread(ticketThread,"一号窗口");
		Thread thread2 = new Thread(ticketThread,"二号窗口");
		Thread thread3 = new Thread(ticketThread,"三号窗口");
		Thread thread4 = new Thread(ticketThread,"四号窗口");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
//模拟多个窗口购票

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