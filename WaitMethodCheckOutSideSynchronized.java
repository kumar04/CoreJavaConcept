package com.thread.threadlocal;

class MyRunable implements Runnable {
	public void run() {
		System.out.println("1");
		try {
			this.wait();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class WaitMethodCheckOutSideSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunable runable = new MyRunable();
		Thread thread = new Thread(runable);
		thread.start();

	}

}
