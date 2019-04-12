package com.anonymous;

public class Main {
	
	public static void main(String[] args) {

		// TODO Auto-generated constructor stub
		InterfaceB b = new InterfaceB() {
			
			@Override
			public void a() {
				System.out.println("A");
				
			}
			
			@Override
			public void b() {
				// TODO Auto-generated method stub
				System.out.println("B");
				
			}
		};
		
		b.a();
		b.b();
	
	}

	
	
	
}
