package com.prashant.entity;

public class Employee {
	private int id;
	private String name;
	private int marks;
	
	public Employee() {
		super();
		this.id = 100;
		this.name = "ScaleUp India";
		this.marks = 100;
	}

	public Employee(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}