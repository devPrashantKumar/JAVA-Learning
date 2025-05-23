package com.prashant.example6;

import java.util.Set;
import java.util.TreeSet;

import com.prashant.entity.CustomEmployeeComparator;
import com.prashant.entity.Employee;


public class Demo {
	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>();
		set.add(new Employee(20, "Harry"));
		set.add(new Employee(10, "Tom"));
		set.add(new Employee(50, "Dick"));

		System.out.println("---DEFAULT---");
		System.out.println("Contents of set are: " + set);

		System.out.println("---SORT BY NAME---");
		Set<Employee> set2 = new TreeSet<>(new CustomEmployeeComparator());
		set2.addAll(set);
		System.out.println("Contents of set are: " + set2);
	}
}
