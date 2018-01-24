package com.thread.threadlocal;

class MyRunnable implements Runnable {
	public void run() {
		method();
	}

	synchronized void method() {
		for (int i = 0; i < 2; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class ThreadClassBeheviour {
	public static void main(String... args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable, "Thread-1");
		Thread thread2 = new Thread(runnable, "Thread-2");
		thread1.start();
		thread2.start();
	}
}

//Thread-1 Thread-1 Thread-2 Thread-2 (you can't except the right behaviour of * thread)
 