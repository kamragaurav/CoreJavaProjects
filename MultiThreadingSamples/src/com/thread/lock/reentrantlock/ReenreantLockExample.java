package com.thread.lock.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReenreantLockExample {
	
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
		lock.lock();
		System.out.println(lock.getHoldCount());  //2
		System.out.println(lock.getQueueLength()); //0
		System.out.println(lock.hasQueuedThreads()); //false
		System.out.println(lock.isFair()); //false
		System.out.println(lock.isHeldByCurrentThread()); //true
		System.out.println(lock.isLocked()); //true
		System.out.println(lock.hasQueuedThread(Thread.currentThread())); //false
		lock.unlock();
		System.out.println(lock.getQueueLength());//0
		System.out.println(lock.getHoldCount());//1
		System.out.println(lock.isLocked());//true
		lock.unlock();
		System.out.println(lock.getQueueLength());//0
		System.out.println(lock.getHoldCount());//0
		System.out.println(lock.isLocked());//false
	}

}
