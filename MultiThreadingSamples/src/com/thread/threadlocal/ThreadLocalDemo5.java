package com.thread.threadlocal;
class ParentThread1 extends Thread{
	
	public static InheritableThreadLocal<String> tl = new InheritableThreadLocal() ;
	
	@Override
	public void run() {
		tl.set("pp");
		ChildThread1 childThread = new ChildThread1();
		System.out.println("Parent job::"+tl.get());
		childThread.start();
	}
}

class ChildThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("Child ::" + ParentThread1.tl.get());
	}
}
public class ThreadLocalDemo5 {
	public static void main(String[] args) {
		ParentThread1 parentThread = new ParentThread1();
		parentThread.start();
	}

}
