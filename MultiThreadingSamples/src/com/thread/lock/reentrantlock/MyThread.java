package com.thread.lock.reentrantlock;

public class MyThread extends Thread {

	Display display;
	String name ;
	public MyThread(Display display , String name) {
		this.display=display;
		this.name=name;
	}
	@Override
	public void run() {
		display.wish(name);
		//display.justPrintName(name);
	}
	public static void main(String[] args) {
		Display display = new Display();
		MyThread sachine = new MyThread(display, "Sachin");
		MyThread yuvi = new MyThread(display, "Yuvi");
		MyThread virat = new MyThread(display, "Virat");
		sachine.start();
		yuvi.start();
		virat.start();
	}
}
