package com.prashant;

import java.util.List;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;


public class Demo {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees(10, () -> new Employee());

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}