package com.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Developer extends Thread{

	CountDownLatch countDownLatch;
	int delay;
	public Developer(CountDownLatch countDownLatch,String name,int delay) {
		super(name);
		this.countDownLatch = countDownLatch;
		this.delay=delay;
	}
	
	@Override
	public void run() {
		System.out.println("Developer Team "+getName()+" Assign Task");
		try {
			sleep(delay);
			countDownLatch.countDown();
			System.out.println("Developer Team "+getName()+" Assign Task is done");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}

