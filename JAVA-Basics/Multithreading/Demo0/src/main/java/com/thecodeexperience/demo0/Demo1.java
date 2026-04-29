package com.thecodeexperience.demo0;

import com.thecodeexperience.demo0.repository.EmployeeRepository;
import com.thecodeexperience.demo0.repository.impl.EmployeeRepositoryImpl1;
import com.thecodeexperience.demo0.repository.impl.EmployeeRepositoryImpl2;
import com.thecodeexperience.demo0.repository.impl.EmployeeRepositoryImpl3;
import com.thecodeexperience.demo0.service.impl.EmployeeServiceImpl;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " started fetching");
		EmployeeServiceImpl employeeServiceImpl = null;
		EmployeeRepository[] employeeRepositories = { new EmployeeRepositoryImpl1(), new EmployeeRepositoryImpl2(),
				new EmployeeRepositoryImpl3() };

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < employeeRepositories.length; i++) {
			employeeServiceImpl = new EmployeeServiceImpl(employeeRepositories[i]);
			employeeServiceImpl.run();
		}

		System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + " milliseconds");
		System.out.println(Thread.currentThread().getName() + " finished fetching");
	}
}
