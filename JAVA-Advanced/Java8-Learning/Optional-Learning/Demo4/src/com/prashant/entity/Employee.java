package com.prashant.entity;

import java.util.Optional;

import com.prashant.utility.GeneratorUtil;

public class Employee {
	private int id;
	private String name;
	private int marks;
	private Optional<Address> address;

	public Employee() {
		super();
		this.id = 100;
		this.name = "ScaleUp India";
		this.marks = 100;
		this.address = Optional.of(GeneratorUtil.populateAddress());
	}

	public Employee(int id, String name, int marks, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = Optional.of(address);
	}

	public Employee(int id, String name, int marks, Optional<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
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

	public Optional<Address> getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
}