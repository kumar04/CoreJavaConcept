package com.core.thread;

public class IntegerThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(2000);
			} catch (Exception exception) {

			}
		}
	}
}
