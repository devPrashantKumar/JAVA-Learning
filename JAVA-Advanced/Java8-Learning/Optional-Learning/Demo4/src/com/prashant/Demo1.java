package com.prashant;

import java.util.Optional;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;

public class Demo1 {

	public static void main(String[] args) {
		Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(60);
		System.out.println(optionalEmployee);

		/*
		 * Filter optionalEmployee with address. If exists then print value else print
		 * "No employee found".
		 */
		System.out.println("---FILTER---");
		optionalEmployee.filter(employee -> employee.getAddress().isPresent())
		.ifPresentOrElse(System.out::println, () -> System.out.println("No employee found"));
	}

}
