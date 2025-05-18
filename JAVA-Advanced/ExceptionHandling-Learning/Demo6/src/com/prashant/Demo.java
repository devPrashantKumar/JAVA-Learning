package com.prashant;

import com.prashant.service.CalculatorService;
import com.prashant.service.impl.CalculatorServiceImpl;
import com.prashant.service.impl.CalculatorServiceImpl1;
import com.prashant.service.impl.CalculatorServiceImpl2;
import com.prashant.service.impl.CalculatorServiceImpl3;


public class Demo {
	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorServiceImpl3();
		try {
			System.out.println("---SCENARIO 1---");
			calculatorService.divide(10, 2);
			System.out.println("---SCENARIO 2---");
			calculatorService.divide(10, 0);
		} catch (Exception exception) {
			System.out.println("Something went wrong : " + exception);
		}
	}
}
