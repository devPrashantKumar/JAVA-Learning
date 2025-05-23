package com.prashant;

import java.util.List;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;


public class Demo1 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---ITERATE---");
		// Create a stream from given list
		// Print the employees
		employeeList.stream().forEach(System.out::println);
	}
}