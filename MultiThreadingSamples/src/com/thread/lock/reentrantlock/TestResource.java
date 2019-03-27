package com.thread.lock.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestResource {
	private Lock displayLock = new ReentrantLock();
	private Lock readLock = new ReentrantLock();
	public void displayRecord() {
		try {
			displayLock.lock();
			System.out.println("Display--Thread "+Thread.currentThread().getName()+" accuire the lock");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Unlock display");
			displayLock.unlock();
		}
		
	}
	
	public void readRecord() {

		try {
			readLock.lock();
			System.out.println("Read--Thread "+Thread.currentThread().getName()+" accuire the lock");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Unlock read");
			readLock.unlock();
		}
		
	
	}

}
