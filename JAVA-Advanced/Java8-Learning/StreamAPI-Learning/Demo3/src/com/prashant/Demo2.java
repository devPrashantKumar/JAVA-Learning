package com.prashant;

import java.util.List;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;


public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---PEEK---");
		//Create a stream from given list
		//Print the employees
		//Count number of employees
		//Print the number of employees
		long count = employeeList.stream()
		.peek(System.out::println)
		.count();
		System.out.println(count);

		System.out.println("---PEEK 2---");
		//Create a stream from given list
		//Print the employees
		//Count number of employees
		//Print the number of employees
		long count2 = employeeList.stream()
		.peek(System.out::println)
		.filter(employee -> employee.getMarks() > -1)
		.count();
		System.out.println(count2);
	}
}