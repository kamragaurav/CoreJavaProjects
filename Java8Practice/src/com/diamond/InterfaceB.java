package com.diamond;

public interface InterfaceB {
	default void printA() {
		System.out.println("B");
	}

}
