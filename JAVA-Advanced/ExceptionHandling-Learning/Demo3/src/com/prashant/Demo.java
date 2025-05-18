package com.prashant;

import com.prashant.service.CalculatorService;
import com.prashant.service.impl.CalculatorServiceImpl;

public class Demo {
	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorServiceImpl();
		try {
			System.out.println("---SCENARIO 1---");
			calculatorService.divide(10, 2);
			System.out.println("---SCENARIO 2---");
			calculatorService.divide2(10, 0);
		} catch (Exception exception) {
			System.out.println("Something went wrong : " + exception);
		}
	}
}
