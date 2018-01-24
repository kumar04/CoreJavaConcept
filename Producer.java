package com.core.thread;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {

	List<Integer> shareQueue;

	/**
	 * @param shareQueue
	 */
	public Producer() {

		shareQueue = new ArrayList<Integer>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				shareQueue.add(i);
				System.out.println("Producer is still producing " + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Production is over, consumer can consume.");
			// Production is over, notify consumer thread so that consumer can consume.
			this.notify();
		}
	}

}
