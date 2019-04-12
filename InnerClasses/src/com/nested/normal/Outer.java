package com.nested.normal;

public class Outer {
	
	int x = 10;
	static int y = 20;
	
	 class Inner{
		int x = 1000;
		public void m1() {
			
			System.out.println("Inner Class Reference "+this+" Outer class referene"+Outer.this);
			System.out.println("Inner class m1 method  x is "+x+"änd y is"+y);
			System.out.println(x);//1000
			System.out.println(this.x);//1000
			System.out.println(Outer.this.x);//10
			
		}
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.m1();
		outer.m2();
	}
	
	public void m2() {
		Inner inner = new Inner();
		inner.m1();
	}

}
