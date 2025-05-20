package com.scaleupindia.service.impl;

import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.repository.EmployeeRepository;


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
