package com.prashant;

import java.util.Optional;

import com.prashant.entity.Employee;

public class Demo3 {

	public static void main(String[] args) {
		/*
		 * Create new employee using null. Save in optionalEmployee. If exists then
		 * print the value, else print "No employee found".
		 */
		System.out.println("---EMPTY---");
		Optional<Employee> optionalEmployee = null;
		optionalEmployee.ifPresentOrElse(System.out::println, () -> System.out.println("No employee found"));

		/*
		 * Create new employee using empty. Save in optionalEmployee. If exists then
		 * print the value, else print "No employee found".
		 */
		System.out.println("---EMPTY---");
		Optional<Employee> optionalEmployee2 = Optional.empty();
		optionalEmployee2.ifPresentOrElse(System.out::println, () -> System.out.println("No employee found"));
	}

}
