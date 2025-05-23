package com.prashant;

import java.util.List;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;


public class Demo1 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---COUNT---");
		// Create a stream from given list
		// Count number of employees
		// Print the number of employees
		long count = employeeList.stream().count();
		System.out.println(count);
	}
}