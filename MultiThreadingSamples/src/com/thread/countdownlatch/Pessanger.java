package com.thread.countdownlatch;

public class Pessanger extends Thread{
	
	public Pessanger(String name) {
		super(name);
		this.start();
		
	}
	
	@Override
	public void run() {
	}

}
