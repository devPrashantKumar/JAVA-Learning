package com.prashant;

import java.util.List;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;


public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees(10, Employee::new);

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}