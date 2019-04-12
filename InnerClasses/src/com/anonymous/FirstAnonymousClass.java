package com.anonymous;

import java.util.Arrays;

interface Sample{
	public int add(int i,int j);
}

public class FirstAnonymousClass {
	static int x =10;
	static String str = "sss";
	
	public static void main(String[] args) {
	
		
		int y =10; // both final and non final local variable can use in anonymous class but it behave like final variable . you can not change the value of local variable in anonymous class
		
		Sample sample = new Sample() {
			@Override
			public int add(int i, int j) {
				return i+j+x+y;
			}
		};
	System.out.println(sample.add(2, 3));
	}

}

