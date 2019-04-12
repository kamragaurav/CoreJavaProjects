package com.nested.normal;

public class Other {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.m1();
	}

}
