package com.prashant;

import com.prashant.service.Operation;


public class Test3 {
	public static void main(String[] args) {
		Operation operation = num -> System.out.println("You are learning Java - " + num);
		operation.print(17);
	}
}