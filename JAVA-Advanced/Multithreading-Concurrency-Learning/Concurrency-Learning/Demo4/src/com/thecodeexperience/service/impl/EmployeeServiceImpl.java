package com.thecodeexperience.service.impl;

import java.util.List;

import com.thecodeexperience.entity.Employee;
import com.thecodeexperience.repository.EmployeeRepository;


public class EmployeeServiceImpl implements Runnable {
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " started fetching from : " + employeeRepository);
		List<Employee> employeeList = employeeRepository.fetchEmployees();
		System.out.println(Thread.currentThread().getName() + " finished fetching from : " + employeeRepository);
	}
}
