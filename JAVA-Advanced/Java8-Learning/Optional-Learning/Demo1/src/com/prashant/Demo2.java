package com.prashant;

import java.util.Optional;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;

public class Demo2 {

	public static void main(String[] args) {
		Optional<Employee> optionalEmployee = GeneratorUtil.fetchEmployeeByMarks(95);
		System.out.println(optionalEmployee);

		/*
		 * Fetch value from optionalEmployee or else get employee from default
		 * constructor.
		 */
		System.out.println("---OR ELSE---");
		Employee employee = optionalEmployee.orElse(new Employee());
		System.out.println(employee);

		/*
		 * Fetch value from optionalEmployee or else get employee from
		 * GeneratorUtil.populateEmployee().
		 */
		System.out.println("---OR ELSE GET---");
		Employee employee2 = optionalEmployee.orElseGet(GeneratorUtil::populateEmployee);
		System.out.println(employee2);
	}

}
