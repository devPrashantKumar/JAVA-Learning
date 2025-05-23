package com.prashant.example7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.prashant.entity.CustomEmployeeComparator;
import com.prashant.entity.Employee;


public class Demo {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(20, "Harry"));
		list.add(new Employee(10, "Tom"));
		list.add(new Employee(50, "Dick"));
		
		System.out.println("---DEFAULT---");
		System.out.println("Contents of list are: " + list);
		
		System.out.println("---SORT BY ID---");
		Collections.sort(list);
		System.out.println("Contents of list are: " + list);
		
		System.out.println("---SORT BY NAME---");
		Collections.sort(list, new CustomEmployeeComparator());
		System.out.println("Contents of list are: " + list);
	}
}
