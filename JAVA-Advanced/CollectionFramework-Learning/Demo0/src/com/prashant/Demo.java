package com.prashant;


public class Demo {
	public static void main(String[] args) {
		System.out.println("Create an array");
		String[] array = new String[5]; // 0 1 2 3 4

		System.out.println("Find size of array");
		System.out.println("Size of array is: " + array.length);

		System.out.println("Display array");
		System.out.println("Contents of array are: " + array);
		for (String element : array) {
			System.out.println("Value of element is: " + element);
		}

		System.out.println("Add element at given index of array");
		array[0] = "Java";
		array[1] = "Python";
		array[3] = "C";
		System.out.println("Size of array is: " + array.length);
		for (String element : array) {
			System.out.println("Value of element is: " + element);
		}

		System.out.println("Fetch element by index from array");
		System.out.println("Element at index 2 is: " + array[2]);
		
		System.out.println("Modify element by index from array");
		array[1] = "Go";
		System.out.println("Size of array is: " + array.length);
		for (String element : array) {
			System.out.println("Value of element is: " + element);
		}

		System.out.println("Remove element by index from array");
		array[1] = null;
		System.out.println("Size of array is: " + array.length);
		for (String element : array) {
			System.out.println("Value of element is: " + element);
		}
		
		System.out.println("Sort elements of array");
		for (int i = 0; i < array.length-1; i++) {
		    for (int j = 0; j < array.length-i-1; j++) {
		        if (array[j] == null || (array[j+1] != null && array[j].compareTo(array[j+1]) > 0)) {
		            String temp = array[j];
		            array[j] = array[j+1];
		            array[j+1] = temp;
		        }
		    }
		}
		System.out.println("Size of array is: " + array.length);
		for (String element : array) {
			System.out.println("Value of element is: " + element);
		}

		System.out.println("Exception scenario");
		array[5] = "exception";
	}
}
