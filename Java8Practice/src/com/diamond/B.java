package com.diamond;

public interface B extends A{

	default void print() {
		System.out.println("B");
	}
}
