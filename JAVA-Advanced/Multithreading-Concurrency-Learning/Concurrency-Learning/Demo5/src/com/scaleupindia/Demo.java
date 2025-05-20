package com.scaleupindia;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.repository.EmployeeRepository;
import com.scaleupindia.repository.impl.EmployeeRepositoryImpl1;
import com.scaleupindia.repository.impl.EmployeeRepositoryImpl2;
import com.scaleupindia.repository.impl.EmployeeRepositoryImpl3;
import com.scaleupindia.service.impl.EmployeeServiceImpl;


public class Demo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " started fetching");
		EmployeeServiceImpl employeeServiceImpl = null;
		EmployeeRepository[] employeeRepositories = { new EmployeeRepositoryImpl1(), new EmployeeRepositoryImpl2(),
				new EmployeeRepositoryImpl3() };

		long startTime = System.currentTimeMillis();
		ExecutorService executorService = Executors.newCachedThreadPool();
		List<Future<List<Employee>>> futureList = new ArrayList<>();
		for (int i = 0; i < employeeRepositories.length; i++) {
			employeeServiceImpl = new EmployeeServiceImpl(employeeRepositories[i]);
			Future<List<Employee>> future = executorService.submit(employeeServiceImpl);
			futureList.add(future);
		}

		executorService.shutdown();
		try {
			executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Size of futureList is " + futureList.size());
		futureList.stream().map(future -> {
			try {
				return future.get();
			} catch (InterruptedException | ExecutionException e) {
				throw new RuntimeException(e);
			}
		}).flatMap(List::stream).forEach(System.out::println);
		System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + " milliseconds");
		System.out.println(Thread.currentThread().getName() + " finished fetching");
	}
}
