package CollectionPractice.list;

import java.util.LinkedList;

public class LinkedListClassMethods {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.addFirst(1);
		list1.addFirst(2);
		list1.addLast(3);
		list1.addLast(4);
		System.out.println(list1);
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
		System.out.println(list1);
		System.out.println(list1.removeFirst());
		System.out.println(list1);
		System.out.println(list1.removeLast());
		System.out.println(list1);
	}
}
