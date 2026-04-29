package com.thecodeexperience.repository;

import java.util.List;

import com.thecodeexperience.entity.Employee;


public interface EmployeeRepository {

	List<Employee> fetchEmployees();

}