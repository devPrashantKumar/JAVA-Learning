package com.scaleupindia;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

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
		List<Future<?>> futureList = new ArrayList<>();
		for (int i = 0; i < employeeRepositories.length; i++) {
			employeeServiceImpl = new EmployeeServiceImpl(employeeRepositories[i]);
			Future<?> future = executorService.submit(employeeServiceImpl);
			futureList.add(future);
		}

		executorService.shutdown();
		try {
			executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Size of futureList is " + futureList.size());
		for (Future<?> future : futureList) {
			try {
				System.out.println(future.get());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + " milliseconds");
		System.out.println(Thread.currentThread().getName() + " finished fetching");
	}
}
