package com.waitnotify.thread;

public class WaitNotifyObj implements Runnable {

	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("child class started executions");
			for (int i = 1; i < 100; i++) {
				total = total + i;
			}
			System.out.println("child class giving notify");
			this.notify();
		}

	}

}
