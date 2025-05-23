package com.prashant.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Demo {
	public static void main(String[] args) {
		System.out.println("Create a queue");
		Queue<String> queue = new LinkedList<>();
		
		System.out.println("Find size of queue");
		System.out.println("Size of queue is: " + queue.size());
		
		System.out.println("Display queue");
		System.out.println("Contents of queue are: " + queue);
		
		System.out.println("Add element to queue (always added at tail)");
		queue.add("Java");
		queue.add("Python");
		queue.add("C");
		System.out.println("Size of queue is: " + queue.size());
		System.out.println("Contents of queue are: " + queue);
		queue.offer("C++");
		queue.offer("C#");
		queue.offer("SQL");
		System.out.println("Size of queue is: " + queue.size());
		System.out.println("Contents of queue are: " + queue);
		
		System.out.println("Fetch element from queue (always from head)");
		System.out.println("Element at head is: " + queue.element());
		System.out.println("Element at head is: " + queue.peek());
		
		System.out.println("Remove element from queue (always from head)");
		queue.remove();
		System.out.println("Size of queue is: " + queue.size());
		System.out.println("Contents of queue are: " + queue);
		queue.poll();
		System.out.println("Size of queue is: " + queue.size());
		System.out.println("Contents of queue are: " + queue);
		
		System.out.println("Check if queue contains element");
		String searchableItem = "Java";
		if (queue.contains(searchableItem)) {
			System.out.println("Queue contains element: " + searchableItem);
		}
		
		System.out.println("Clear queue");
		queue.clear();
		System.out.println("Size of queue is: " + queue.size());
		System.out.println("Contents of queue are: " + queue);
		
		System.out.println("Check if queue is empty");
		if (queue.isEmpty()) {
			System.out.println("Queue is empty");
		}
		
		System.out.println("Add elements to queue (always added at tail)");
		List<String> list = Arrays.asList("JavaScript", "C#", "Java");
		queue.addAll(list);
		System.out.println("Size of queue is: " + queue.size());
		System.out.println("Contents of queue are: " + queue);
		
		System.out.println("Sort elements of queue");
		List<String> list2 = new ArrayList<>(queue);
		System.out.println("Contents of list are: " + list2);		
		Collections.sort(list2);
		System.out.println("Contents of sorted list are: " + list2);
	}
}
