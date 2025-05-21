package com.prashant;

import com.prashant.service.Operation;


public class Test2 {
	public static void main(String[] args) {
		Operation operation = new Operation(){
			@Override
			public void print(String language, int version) {
				System.out.println("You are learning " + language + " - " + version);
			}
		};
		operation.print("Java", 17);
	}
}