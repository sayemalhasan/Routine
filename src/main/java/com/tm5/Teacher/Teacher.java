package com.tm5.Teacher;

public class Teacher {
	private int id;
	private String name;
	
	protected Teacher () {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	

}
