package com.prashant.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class Demo {
	public static void main(String[] args) {
		System.out.println("Create a deque");
		Deque<String> deque = new LinkedList<>();

		System.out.println("Find size of deque");
		System.out.println("Size of deque is: " + deque.size());

		System.out.println("Display deque");
		System.out.println("Contents of deque are: " + deque);

		System.out.println("Add element to deque (always added at tail)");
		deque.add("Java");
		deque.add("Python");
		deque.add("C");
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);
		deque.offer("C++");
		deque.offer("C#");
		deque.offer("SQL");
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);
		
		System.out.println("Add element to deque (specifically at tail)");
		deque.addLast("Go");
		deque.addLast("JavaScript");
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);
		deque.offerLast("HTML");
		deque.offerLast("CSS");
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);
		
		System.out.println("Add element to deque (specifically at head)");
		deque.addFirst("Angular");
		deque.addFirst("TypeScript");
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);
		deque.offerFirst("React");
		deque.offerFirst("Spring");
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);

		System.out.println("Fetch element from deque (always from head)");
		System.out.println("Element at head is: " + deque.element());
		System.out.println("Element at head is: " + deque.peek());
		
		System.out.println("Fetch element from deque (specifically from head)");
		System.out.println("Element at head is: " + deque.getFirst());
		System.out.println("Element at head is: " + deque.peekFirst());
		
		System.out.println("Fetch element from deque (specifically from tail)");
		System.out.println("Element at tail is: " + deque.getLast());
		System.out.println("Element at tail is: " + deque.peekLast());

		System.out.println("Remove element from deque (always from head)");
		deque.remove();
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);
		deque.poll();
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);
		
		System.out.println("Remove element from deque (specifically from head)");
		deque.removeFirst();
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);
		deque.pollFirst();
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);
		
		System.out.println("Remove element from deque (specifically from tail)");
		deque.removeLast();
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);
		deque.pollLast();
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);

		System.out.println("Check if deque contains element");
		String searchableItem = "Java";
		if (deque.contains(searchableItem)) {
				System.out.println("Queue contains element: " + searchableItem);
			}

		System.out.println("Clear deque");
		deque.clear();
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);

		System.out.println("Check if deque is empty");
		if (deque.isEmpty()) {
				System.out.println("Deque is empty");
			}

		System.out.println("Add elements to deque (always added at tail)");
		List<String> list = Arrays.asList("JavaScript", "C#", "Java");
		deque.addAll(list);
		System.out.println("Size of deque is: " + deque.size());
		System.out.println("Contents of deque are: " + deque);
		
		System.out.println("Sort elements of deque");
		List<String> list2 = new ArrayList<>(deque);
		System.out.println("Contents of list are: " + list2);		
		Collections.sort(list2);
		System.out.println("Contents of sorted list are: " + list2);
	}
}
