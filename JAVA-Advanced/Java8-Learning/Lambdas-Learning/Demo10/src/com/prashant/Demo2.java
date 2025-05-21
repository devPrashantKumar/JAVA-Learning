package com.prashant;

import java.util.Collections;
import java.util.List;

import com.prashant.entity.Employee;
import com.prashant.utility.CustomComparator;
import com.prashant.utility.GeneratorUtil;


public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		CustomComparator customComparator = new CustomComparator();

		System.out.println("Sort by name:");
		Collections.sort(employeeList, (o1, o2) -> customComparator.compareByName(o1, o2));
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		System.out.println("Sort by marks:");
		Collections.sort(employeeList, (o1, o2) -> customComparator.compareByMarks(o1, o2));
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}