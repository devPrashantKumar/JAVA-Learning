package com.prashant;

import java.util.List;
import java.util.stream.Stream;

import com.prashant.entity.Employee;
import com.prashant.utility.GeneratorUtil;
import com.prashant.utility.LogUtil;


public class Demo4 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		// Create a parallel stream from given list
		// Filter employees by marks more than equal to 60
		// Print the number of filtered employees
		// Print employee before filtering, during filtering and after filtering using LogUtil.logWithSleep()
		Stream<Employee> stream = employeeList.parallelStream();
		long start = System.currentTimeMillis();
		Stream<Employee> filteredStream = stream
				.peek(employee -> LogUtil.logWithSleep("Pre Filter  : " + employee))
				.filter(employee -> {
					LogUtil.logWithSleep("Filtering   : " + employee);
					return employee.getMarks() >= 60;
				})
				.peek(employee -> LogUtil.logWithSleep("Post Filter : " + employee));

		LogUtil.logWithSleep("---PARALLEL STREAM---");
		LogUtil.logWithSleep("Count : " + filteredStream.count());
		System.out.println(System.currentTimeMillis() - start + " milliseconds with sleep");
	}
}