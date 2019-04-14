package com.thread.lock.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockMilli {
	
	public static void main(String[] args) {
		Lock lock = new ReentrantLock(); 
		Runnable runnable = ()->{
			try {
				if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()+ " Got the lock");
					Thread.sleep(2000);
					lock.unlock();
				}else {
					System.out.println(Thread.currentThread().getName()+ " Not Got the lock");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Thread thread1 = new Thread(runnable, "Thread1");
		Thread thread2 = new Thread(runnable, "Thread2");
		Thread thread3 = new Thread(runnable, "Thread3");
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
