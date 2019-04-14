package com.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo1 {
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(4);
		PrintJob[] printJobs = {
				new PrintJob("Sachin"),
				new PrintJob("Rahul"),
				new PrintJob("Sourav"),
				new PrintJob("Gangully"),
				new PrintJob("Sehwag"),
				new PrintJob("Gambhir")
		};
		
		for (PrintJob printJob : printJobs) {
			service.submit(printJob);
		}
		service.shutdown();
	}

}
