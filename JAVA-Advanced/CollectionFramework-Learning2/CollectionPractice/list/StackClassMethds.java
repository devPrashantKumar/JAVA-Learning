package CollectionPractice.list;

import java.util.LinkedList;
import java.util.Stack;

public class StackClassMethds {

	public static void main(String[] args) {
		Stack<Integer> list1 = new Stack<>();
		list1.push(1);
		list1.push(2);
		list1.push(3);
		list1.push(4);
		System.out.println(list1);
		list1.pop();
		System.out.println(list1);
		System.out.println(list1.peek());
		System.out.println(list1);
		System.out.println(list1.search(1)); // only in case of search, indexing in stack starts from 1---size, 1 is the index of topmost element
		System.out.println(list1.get(0));
	}

}
