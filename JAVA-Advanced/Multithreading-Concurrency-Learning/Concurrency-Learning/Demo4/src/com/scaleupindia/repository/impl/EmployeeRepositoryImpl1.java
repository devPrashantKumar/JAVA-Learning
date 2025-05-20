package com.scaleupindia.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.repository.EmployeeRepository;


public class EmployeeRepositoryImpl1 implements EmployeeRepository {
	private static List<Employee> employeeList = new ArrayList<>();

	static {
		employeeList.add(new Employee(101, "Abhishek"));
		employeeList.add(new Employee(102, "Sneh"));
		employeeList.add(new Employee(103, "Lakshay"));
		employeeList.add(new Employee(104, "Aditi"));
		employeeList.add(new Employee(105, "Raman"));
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
		return "EmployeeRepositoryImpl1";
	}
}