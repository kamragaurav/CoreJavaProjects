package com.creational.singleton;

public class Singleton {
	private static final Singleton newInstance = new Singleton();
	
	private Singleton() {
		System.out.println("Constructor");
	}
	
	public static Singleton getSingleton() {
		return newInstance;
	}

}
