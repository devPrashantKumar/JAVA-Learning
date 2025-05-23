package com.prashant;

import java.util.Optional;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;

public class Demo6 {

	public static void main(String[] args) {
		Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(60);
		System.out.println(optionalEmployee);

		/*
		 * Convert optionalEmployee back to Stream and then print the value.
		 */
		System.out.println("---STREAM---");
		optionalEmployee.stream().forEach(System.out::println);
	}

}
