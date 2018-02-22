package com.core.thread;

public class ThreadJoinMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			IntegerThread t = new IntegerThread();
			t.start();
			//t.join();
			for (int i = 0; i < 5; i++) {
				System.out.println("parent thread");
			}
		} catch (Exception ex) {
			System.out.println("Exception:" + ex);

		}

	}

}
