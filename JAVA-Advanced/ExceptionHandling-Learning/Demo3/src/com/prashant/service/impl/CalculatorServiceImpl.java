package com.prashant.service.impl;

import com.prashant.service.CalculatorService;


public class CalculatorServiceImpl implements CalculatorService {

	public void divide2(Integer... array) {
		divide(array);
	}

	@Override
	public void divide(Integer... array) {
		int quotient = 0;
		quotient = array[0] / array[1];
		System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
	}
}
