package com.prashant.utility;

import com.prashant.entity.Employee;


public class CustomComparator {
	public int compareByName(Employee a, Employee b) {
		return a.getName().compareTo(b.getName());
	}

	public int compareByMarks(Employee a, Employee b) {
		return a.getMarks() - b.getMarks();
	}
}