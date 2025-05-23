package com.prashant;

import java.util.Optional;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;

public class Demo1 {

	public static void main(String[] args) {
		Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(60);
		System.out.println(optionalEmployee);

		/*
		 * Fetch value from optionalEmployee.
		 */
		System.out.println("---GET---");
		Employee employee = optionalEmployee.get();
		System.out.println(employee);
	}

}
