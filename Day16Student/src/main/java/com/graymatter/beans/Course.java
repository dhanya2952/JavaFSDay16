package com.graymatter.beans;

import java.util.HashSet;

public class Course {
	
	private int id;
	private HashSet<String> courses;
	@Override
	public String toString() {
		return "Course [id=" + id + ", courses=" + courses + "]";
	}
	public Course(int id, HashSet<String> courses) {
		super();
		this.id = id;
		this.courses = courses;
	}
	public Course() {
		super();
	}

}
