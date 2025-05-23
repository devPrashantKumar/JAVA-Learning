package com.prashant;

import java.util.Optional;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * Create new employee generated from GeneratorUtil.populateEmployee(). Save in
		 * optionalEmployee. If exists then print the value, else print
		 * "No employee found".
		 */
		System.out.println("---OF---");
		Optional<Employee> optionalEmployee = Optional.of(GeneratorUtil.populateEmployee());
		optionalEmployee.ifPresentOrElse(System.out::println, () -> System.out.println("No employee found"));

		/*
		 * Create new employee generated from GeneratorUtil.populateEmployee2(). Save in
		 * optionalEmployee. If exists then print the value, else print
		 * "No employee found".
		 */
		System.out.println("---OF---");
		Optional<Employee> optionalEmployee2 = Optional.of(GeneratorUtil.populateEmployee2());
		optionalEmployee2.ifPresentOrElse(System.out::println, () -> System.out.println("No employee found"));
	}

}
