package com.thread.threadlocal;

class MyThread1 extends Thread {

	public void run() {
		System.out.println("1");
	}

	public void start() {
		System.out.println("2");
	}

}

public class OverrideStartMethodThread {
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		thread1.start();

	}

}