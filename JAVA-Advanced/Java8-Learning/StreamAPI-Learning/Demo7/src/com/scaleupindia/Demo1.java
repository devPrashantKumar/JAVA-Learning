package com.scaleupindia;

import java.util.List;
import java.util.stream.Stream;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;
import com.scaleupindia.utility.LogUtil;


public class Demo1 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		// Create a stream from given list
		// Filter employees by marks more than equal to 60
		// Print the number of filtered employees
		// Print employee before filtering, during filtering and after filtering using LogUtil.logWithoutSleep()
		Stream<Employee> stream = employeeList.stream();
		long start = System.currentTimeMillis();
		Stream<Employee> filteredStream = stream
				.peek(employee -> LogUtil.logWithoutSleep("Pre Filter  : " + employee))
				.filter(employee -> {
					LogUtil.logWithoutSleep("Filtering   : " + employee);
					return employee.getMarks() >= 60;
				})
				.peek(employee -> LogUtil.logWithoutSleep("Post Filter : " + employee));

		LogUtil.logWithoutSleep("---STREAM---");
		LogUtil.logWithoutSleep("Count : " + filteredStream.count());
		System.out.println(System.currentTimeMillis() - start + " milliseconds without sleep");
	}
}