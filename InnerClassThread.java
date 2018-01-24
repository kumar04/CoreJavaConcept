package com.thread.threadlocal;

public class InnerClassThread extends Thread {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	InnerClassThread() {
		System.out.println("1");
	}

	@Override
	public void run() {
		System.out.println("2");
	}

	public static void main(String args[]) {
		Thread thread = new InnerClassThread() {
			public void run() {
				System.out.println("3");
			}
		};
		thread.start();
	}

}

// output:
// 1
// 3
