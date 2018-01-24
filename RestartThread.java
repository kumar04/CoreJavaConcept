package com.thread.threadlocal;

public class RestartThread implements Runnable {

	@Override
	public void run() {
		System.out.println("1");
	}

	public static void main(String[] args) {
		RestartThread obj = new RestartThread();
		Thread thread1 = new Thread(obj, "Thread-1");
		thread1.start();
		thread1.start();
	}

}