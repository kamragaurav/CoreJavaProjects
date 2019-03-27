package com.thread.lock.reentrantlock;

public class DisplayJob implements Runnable {
	private TestResource resource;
	
	public DisplayJob(TestResource resource) {
		// TODO Auto-generated constructor stub
		this.resource=resource;
	}
	
	@Override
	public void run() {
		resource.displayRecord();
	}

}
