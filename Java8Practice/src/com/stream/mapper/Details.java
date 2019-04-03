package com.stream.mapper;

import java.util.List;

public class Details {

	private int id;
	private List<String> parts;
	
	public Details() {
		// TODO Auto-generated constructor stub
	}
	
	public Details(int id, List<String> parts) {
		super();
		this.id = id;
		this.parts = parts;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getParts() {
		return parts;
	}
	public void setParts(List<String> parts) {
		this.parts = parts;
	}
	
	
}
