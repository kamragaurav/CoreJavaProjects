package com.diamond;

import java.util.ArrayList;

public class DeriveA implements A1,A2{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		A1.super.print();
	}
	
public static void main(String[] args) {
	ArrayList<Object> al = new ArrayList<>();
	DeriveA a = new DeriveA();
	a.print();
}
}
