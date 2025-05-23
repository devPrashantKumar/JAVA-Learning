package com.prashant;

import java.util.Optional;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;

public class Demo3 {

	public static void main(String[] args) {
		Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(95);
		System.out.println(optionalEmployee);

		/*
		 * Fetch value from optionalEmployee or else throw exception.
		 */
		System.out.println("---OR ELSE THROW---");
		try {
			Employee employee = optionalEmployee.orElseThrow();
			System.out.println(employee);
		} catch (Exception exception) {
			System.out.println(exception);
		}

		/*
		 * Fetch value from optionalEmployee or else throw NoSuchElementException with
		 * message as "No employee found".
		 */
		System.out.println("---OR ELSE THROW---");
		try {
			Employee employee = optionalEmployee.orElseThrow(() -> new ArithmeticException("No employee found"));
			System.out.println(employee);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

}
