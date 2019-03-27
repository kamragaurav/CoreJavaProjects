package com.thread.lock.reentrantlock;

public class ReadJob implements Runnable {

	private TestResource resource;
	
	public ReadJob(TestResource resource) {
		this.resource=resource;
	}
	
	@Override
	public void run() {
		resource.readRecord();
	}

}
