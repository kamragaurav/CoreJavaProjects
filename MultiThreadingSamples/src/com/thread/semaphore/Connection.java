package com.thread.semaphore;

import java.util.concurrent.Semaphore;

public class Connection {
	
	private static Connection INSTANCE = new Connection();
	Semaphore semaphore = new Semaphore(10,true);
	private int numberOfConnetion;
	private Connection() {
		
	}
	
	public static Connection getConnection() {
		return INSTANCE;
	}
	public void connect() {
		try {
			semaphore.acquire();
			synchronized (this) {
				numberOfConnetion++;
				System.out.println("Number of connection :"+ numberOfConnetion+ " "+ Thread.currentThread().getName());
			}
			
			Thread.sleep(2000);
			synchronized (this) {
				numberOfConnetion--;
				System.out.println("Number of connection :"+ numberOfConnetion);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(semaphore!=null) {
				semaphore.release();
			}
		}
		
		
	}

}
