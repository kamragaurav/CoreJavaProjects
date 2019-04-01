package com.thread.threadlocal;

public class MyThread implements Runnable{

	ThreadLocal<Integer> local = new ThreadLocal<>();
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			assignThreadLocal();
		}
	}

	public void assignThreadLocal() {

		local.set((int)(Math.random()*100));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread Name: "+Thread.currentThread().getName() + " Thread Local "+ local.get());
	
	}
}
