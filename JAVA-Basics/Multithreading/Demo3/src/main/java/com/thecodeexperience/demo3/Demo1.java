package com.thecodeexperience.demo3;

import com.thecodeexperience.demo3.repository.EmployeeRepository;
import com.thecodeexperience.demo3.repository.impl.EmployeeRepositoryImpl1;
import com.thecodeexperience.demo3.repository.impl.EmployeeRepositoryImpl2;
import com.thecodeexperience.demo3.repository.impl.EmployeeRepositoryImpl3;
import com.thecodeexperience.demo3.service.impl.EmployeeServiceImpl;


public class Demo1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " started fetching");
		EmployeeServiceImpl employeeServiceImpl = null;
		EmployeeRepository[] employeeRepositories = { new EmployeeRepositoryImpl1(), new EmployeeRepositoryImpl2(),
				new EmployeeRepositoryImpl3() };
		Thread[] employeeServices = new Thread[employeeRepositories.length];
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < employeeRepositories.length; i++) {
			employeeServiceImpl = new EmployeeServiceImpl(employeeRepositories[i]);
			employeeServices[i] = new Thread(employeeServiceImpl);
			System.out.println("Just after using new keyword -> Name: " + employeeServices[i].getName() + ", isAlive: " + employeeServices[i].isAlive() + ", state: " + employeeServices[i].getState());
			employeeServices[i].start();
			System.out.println("Just after using start method -> Name: " + employeeServices[i].getName() + ", isAlive: " + employeeServices[i].isAlive() + ", state: " + employeeServices[i].getState());
		}
		
		for (int i = 0; i < employeeServices.length; i++) {
			try {
				employeeServices[i].join();
				System.out.println("Just after using join method -> Name: " + employeeServices[i].getName() + ", isAlive: " + employeeServices[i].isAlive() + ", state: " + employeeServices[i].getState());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + " milliseconds");
		System.out.println(Thread.currentThread().getName() + " finished fetching");
	}
}
