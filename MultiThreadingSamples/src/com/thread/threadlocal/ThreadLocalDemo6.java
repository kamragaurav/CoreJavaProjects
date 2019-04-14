package com.thread.threadlocal;
class ParentThread2 extends Thread{
	
	public static InheritableThreadLocal<String> tl = new InheritableThreadLocal() {
		
		protected Object childValue(Object parentValue) {
			return "CC";};
		
	};
	
	@Override
	public void run() {
		tl.set("pp");
		ChildThread2 childThread = new ChildThread2();
		System.out.println("Parent job::"+tl.get());
		childThread.start();
	}
}

class ChildThread2 extends Thread{
	@Override
	public void run() {
		System.out.println("Child ::" + ParentThread2.tl.get());
	}
}
public class ThreadLocalDemo6 {
	public static void main(String[] args) {
		ParentThread2 parentThread = new ParentThread2();
		parentThread.start();
	}

}
