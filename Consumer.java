package com.core.thread;

class Consumer extends Thread {
	Producer prod;

	Consumer(Producer obj) {
		prod = obj;
	}

	public void run() {
		/*
		 * consumer will wait till producer is producing.
		 */
		synchronized (this.prod) {

			try {
				System.out.println(
						"First consumer thread want to consume some product,but intially there is no product in production,so consumer thread go wait state");
				this.prod.wait();
				System.out.println("after producer produce the product");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		/* production is over, consumer will start consuming. */
		int productSize = this.prod.shareQueue.size();
		for (int i = 0; i < productSize; i++)
			System.out.println("CONSUMED : " + this.prod.shareQueue.remove(0) + " ");

	}

}