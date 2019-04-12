package com.creational.singleton;

import java.lang.reflect.Constructor;

public class Client {
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		print("s1",s1);
		print("s2",s2);
		try {
			Class cls = Class.forName("com.creational.singleton.Singleton");
			cls.getDeclaredC
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void print(String name , Singleton object) {
		System.out.println("HashCode of object named "+ name + " Hash code is "+object.hashCode());
	}

}
