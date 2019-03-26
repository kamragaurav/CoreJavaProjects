package com.thread.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConnectionClient {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 100; i++) {
			executorService.submit(new Runnable() {
				
				@Override
				public void run() {
					Connection.getConnection().connect();
					
				}
			});
		}
		executorService.shutdown();
	}

}
