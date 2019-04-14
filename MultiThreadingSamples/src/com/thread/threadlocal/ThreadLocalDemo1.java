package com.thread.threadlocal;

public class ThreadLocalDemo1 {
	public static void main(String[] args) {
		ThreadLocal<Integer> intVal = new ThreadLocal<>();
		System.out.println(intVal.get()); //null
		intVal.set(20);
		System.out.println(intVal.get());//20
		intVal.remove();
		System.out.println(intVal.get());//null
	}

}
