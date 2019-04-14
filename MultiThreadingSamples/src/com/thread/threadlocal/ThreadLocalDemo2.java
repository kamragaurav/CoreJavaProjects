package com.thread.threadlocal;

class ThreadDemo extends Thread{
	
	public static int number = 15;
	
	public ThreadDemo(String name) {
		super(name);
	}
	
	ThreadLocal<Integer> local = new ThreadLocal(){
		
		protected Integer initialValue() {
			return new Integer(number--); }; {
			
		};
	};
	
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(Thread.currentThread().getName()+" Thread Local value "+local.get());
		}
	}
}

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		ThreadDemo thread1 = new ThreadDemo("Thread1");
		ThreadDemo thread2 = new ThreadDemo("Thread2");
		thread1.start();
		thread2.start();
		
	}
}
