package com.prashant.example3;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class Demo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("Java");
		queue.add("Python");
		queue.add("C");

		System.out.println("---enhanced for loop---");
		for (String element : queue)
			System.out.println("Value of element is: " + element);

		System.out.println("---using iterator---");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext())
			System.out.println("Value of element is: " + iterator.next());

		Deque<String> deque = new LinkedList<>();
		deque.add("Java");
		deque.add("Python");
		deque.add("C");

		System.out.println("---enhanced for loop---");
		for (String element : deque)
			System.out.println("Value of element is: " + element);

		System.out.println("---using iterator---");
		Iterator<String> iterator2 = deque.iterator();
		while (iterator2.hasNext())
			System.out.println("Value of element is: " + iterator2.next());

		System.out.println("---using descendingIterator---");
		Iterator<String> descendingIterator = deque.descendingIterator();
		while (descendingIterator.hasNext())
			System.out.println("Value of element is: " + descendingIterator.next());

	}
}
