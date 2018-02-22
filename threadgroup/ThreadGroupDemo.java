package com.thread.threadgroup;

// ThreadGroupDemo.java
class ThreadGroupDemo {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("subgroup 1");
		Thread t1 = new Thread(tg, "thread 1");
		Thread t2 = new Thread(tg, "thread 2");
		Thread t3 = new Thread(tg, "thread 3");
		tg = new ThreadGroup("subgroup 2");
		Thread t4 = new Thread(tg, "my thread");
		tg = Thread.currentThread().getThreadGroup();
		int agc = tg.activeGroupCount();
		System.out.println("Active thread groups in " + tg.getName()
				+ " thread group: " + agc);
		tg.list();
	}
}

/*Every Java thread is a member of a thread group. Thread groups provide a mechanism for collecting multiple threads into a single object
and manipulating those threads all at once, rather than individually. For example, you can start or suspend all the threads within a group 
with a single method call.*/