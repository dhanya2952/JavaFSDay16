package com.graymatter.beans;

import java.util.Set;

public class Student_two {
	
	private int id;
	private String name;
	private Set<Department> dept;
	public Student_two() {
		super();
	}
	public Student_two(int id, String name, Set<Department> dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student_two [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	

}
