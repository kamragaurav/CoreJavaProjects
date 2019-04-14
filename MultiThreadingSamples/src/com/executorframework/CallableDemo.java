package com.executorframework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		SummingJob[] jobs = {
				new SummingJob(2),
				new SummingJob(3),
				new SummingJob(4),
				new SummingJob(5),
				new SummingJob(6),
				new SummingJob(7),
				};
		for (SummingJob summingJob : jobs) {
			Future future = executorService.submit(summingJob);
			System.out.println(future.get());
		}
		
		executorService.shutdown();
		
	}

}
