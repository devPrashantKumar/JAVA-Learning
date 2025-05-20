package com.scaleupindia.repository;

import java.util.List;

import com.scaleupindia.entity.Employee;


public interface EmployeeRepository {

	List<Employee> fetchEmployees();

}