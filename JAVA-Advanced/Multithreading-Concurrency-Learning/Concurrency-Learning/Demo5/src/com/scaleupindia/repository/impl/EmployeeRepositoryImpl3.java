package com.scaleupindia.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.repository.EmployeeRepository;


public class EmployeeRepositoryImpl3 implements EmployeeRepository {
	private static List<Employee> employeeList = new ArrayList<>();

	static {
		employeeList.add(new Employee(301, "Kapil"));
		employeeList.add(new Employee(302, "Manish"));
		employeeList.add(new Employee(303, "Vikram"));
		employeeList.add(new Employee(304, "Ajita"));
		employeeList.add(new Employee(305, "Deepa"));
	}
	
	@Override
	public List<Employee> fetchEmployees() {
		List<Employee> employeeList2 = new ArrayList<>();
		for (Employee employee : employeeList) {
			employeeList2.add(employee);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return employeeList2;
	}

	@Override
	public String toString() {
		return "EmployeeRepositoryImpl3";
	}
}