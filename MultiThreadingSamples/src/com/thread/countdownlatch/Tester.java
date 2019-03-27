package com.thread.countdownlatch;

public class Tester extends Thread{
	
	public Tester(String name) {
		super(name);
		
	}
	@Override
	public void run() {
		System.out.println("Tester start working");
	}

}
