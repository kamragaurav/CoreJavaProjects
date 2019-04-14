package com.thread.lock.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
	ReentrantLock lock = new ReentrantLock();
	
	public  void wish(String name) {
		
		if(lock.tryLock()) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello "+name);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			lock.unlock();
		}else {
			System.out.println(name +" did not got the lock and will not come to check the lock again");
		}
		
	}

	public void justPrintName(String name) {
		// TODO Auto-generated method stub
		System.out.println("name::"+name);
	}

}
