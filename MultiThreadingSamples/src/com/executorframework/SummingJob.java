package com.executorframework;

import java.util.concurrent.Callable;

public class SummingJob implements Callable{
	
	public int number;
	public SummingJob(int number) {
		this.number = number;
	}
	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" Calculating the sum of "+number);
		return (number*(number+1))/2;
	}
	
}
