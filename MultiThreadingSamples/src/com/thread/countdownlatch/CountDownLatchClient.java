package com.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchClient {
	
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(2);
		Developer teamA = new Developer(countDownLatch, "Team-A",1000);
		Developer teamB = new Developer(countDownLatch, "Team-B",2000);
		Tester tester = new Tester("tester");
		teamA.start();
		teamB.start();
		countDownLatch.await();
		tester.start();
	}

}
