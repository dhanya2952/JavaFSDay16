package com.graymatter.beans;

public class Student {
	private String name;
	private int id; 
	private Course course; 
	public Student() {
		super();
	}
	
	
	public Student(String name, int id, Course course) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;
	}


	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", course=" + course + "]";
	}
	
	
	

}
