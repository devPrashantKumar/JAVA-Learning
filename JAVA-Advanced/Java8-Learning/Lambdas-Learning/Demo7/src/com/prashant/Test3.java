package com.prashant;

import com.prashant.service.Operation;


public class Test3 {
	public static void main(String[] args) {
		Operation operation = (language, version) -> System.out.println("You are learning " + language + " - " + version);
		operation.print("Java", 17);
	}
}