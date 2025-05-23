package com.prashant;

import java.util.Optional;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;

public class Demo2 {

	public static void main(String[] args) {
		Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(66);
		System.out.println(optionalEmployee);

		/*
		 * Check if value is present in optionalEmployee, if exists then print the
		 * value.
		 */
		System.out.println("---IF PRESENT---");
		optionalEmployee.ifPresent(System.out::println);

		/*
		 * Check if value is present in optionalEmployee, if exists then print the
		 * value, else print "No employee found".
		 */
		System.out.println("---IF PRESENT OR ELSE---");
		optionalEmployee.ifPresentOrElse(System.out::println, () -> System.out.println("No employee found"));
	}

}
