package com.waitnotify.thread;

public class WaitNotifyTest {

	public static void main(String[] args) throws InterruptedException {

		WaitNotifyObj obj = new WaitNotifyObj();
		Thread t = new Thread(obj);
		t.start();
		synchronized (obj) {
			System.out.println("main thread call wait method");
			obj.wait();
			System.out.println("main thread got notification call");
			System.out.println(obj.total);
		}
	}

}
