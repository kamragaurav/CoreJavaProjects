package com.threadgroups;

public class ThreadGroupPriorities {
	
	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("Group1");
		System.out.println(group.getMaxPriority());
		Thread thread1 = new Thread(group, "Thread1");
		Thread thread2 = new Thread(group, "Thread2");
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
		group.setMaxPriority(3);
		Thread thread3 = new Thread(group, "Thread3");
		System.out.println(group.getMaxPriority());
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
		System.out.println(thread3.getPriority());
		System.out.println("================================================"+group.activeCount());
		
		TGEnumaration(Thread.currentThread().getThreadGroup().getParent());
		
		TGEnumaration(group);// no out put because this group is not having active thread once we call thread.start method only that time thread will active.
		thread3.start();
		thread2.start();
		thread1.start();
		
		TGEnumaration(group);
	}
	
	public static void TGEnumaration(ThreadGroup group) {
		Thread[] threadArray = new Thread[group.activeCount()];
		group.enumerate(threadArray);
		for (Thread thread : threadArray) {
			System.out.println(thread.getName());
		}
		
		System.out.println("=====================================");
		
	}

}
