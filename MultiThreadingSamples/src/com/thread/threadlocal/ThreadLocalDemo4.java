package com.thread.threadlocal;
class ParentThread extends Thread{
	
	/*public static ThreadLocal<String> tl = new ThreadLocal() {
		@Override
		protected Object initialValue() {
			// TODO Auto-generated method stub
			return "pp";
		}
	};*/
	
	// if you uncomment above code it will set ThreadLocal value at class level and when any class or thread try to access this thread local value using get method , thy will recieve pp as output
	// means above statement is not thread specific its class specific, always set value inside the run method
	public static ThreadLocal<String> tl = new ThreadLocal() ;
	
	@Override
	public void run() {
		tl.set("pp");
		ChildThread childThread = new ChildThread();
		System.out.println("Parent job::"+tl.get());
		childThread.start();
	}
}

class ChildThread extends Thread{
	@Override
	public void run() {
		System.out.println("Child ::" + ParentThread.tl.get());
	}
}
public class ThreadLocalDemo4 {
	public static void main(String[] args) {
		ParentThread parentThread = new ParentThread();
		parentThread.start();
	}

}
