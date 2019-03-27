package com.thread.lock.reentrantlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockClient {
	public static void main(String[] args) throws InterruptedException {
		TestResource resource = new TestResource();
		ExecutorService readService = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			readService.submit(new ReadJob(resource));
			readService.submit(new DisplayJob(resource));
		}
		Thread.sleep(10000);
		readService.shutdown();
	}

}
