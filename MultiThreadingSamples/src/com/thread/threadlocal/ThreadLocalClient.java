package com.thread.threadlocal;

public class ThreadLocalClient {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		Thread thread2 = new Thread(myThread);
		
		thread.start();
		thread.join();
		thread2.start();
		thread2.join();
	}

}
