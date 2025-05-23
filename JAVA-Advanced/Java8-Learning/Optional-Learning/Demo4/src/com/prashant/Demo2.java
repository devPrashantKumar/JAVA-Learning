package com.prashant;

import java.util.Optional;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;

public class Demo2 {

	public static void main(String[] args) {
		Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(60);
		System.out.println(optionalEmployee);

		/*
		 * Map name of optionalEmployee and save in optionalName. Print optionalName. If
		 * optionalName exists then print value else print "No employee found".
		 */
		System.out.println("---MAP---");
		Optional<String> optionalName = optionalEmployee.map(Employee::getName);
		System.out.println(optionalName);

		optionalName.ifPresentOrElse(System.out::println, () -> System.out.println("No employee found"));
	}

}
