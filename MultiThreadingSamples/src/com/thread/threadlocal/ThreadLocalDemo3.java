package com.thread.threadlocal;

public class ThreadLocalDemo3 {
	
	public static void main(String[] args) {
		ThreadLocal<String> intVal = new ThreadLocal() {
			@Override
			protected Object initialValue() {
				// TODO Auto-generated method stub
				return "initials";
			}
		};
	
		System.out.println(intVal.get()); //initials
		intVal.set("xyz");
		System.out.println(intVal.get());//xyz
		intVal.remove();
		System.out.println(intVal.get());//initials
		
	}

}
