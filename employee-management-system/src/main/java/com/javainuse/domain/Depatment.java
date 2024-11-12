package com.javainuse.domain;

public class Depatment {
	
	private String name;
	
	
	
	public Depatment(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Depatment [name=" + name + "]";
	}
	
	
	

}
