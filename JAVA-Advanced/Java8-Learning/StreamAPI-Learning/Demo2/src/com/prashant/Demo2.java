package com.prashant;

import java.util.List;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;


public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---FILTER---");
		//Create a stream from given list
		//Filter employees with marks more than equal to 60
		//Print the employees
		employeeList.stream()
		.filter(employee -> employee.getMarks() >= 60)
		.forEach(System.out::println);
	}
}