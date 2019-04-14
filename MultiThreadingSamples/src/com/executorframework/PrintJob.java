package com.executorframework;

public class PrintJob implements Runnable{
	
	String name;
	public PrintJob(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		System.out.println(name+ " Thread job start by "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			System.out.println(name+ " Thread job completed by "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
