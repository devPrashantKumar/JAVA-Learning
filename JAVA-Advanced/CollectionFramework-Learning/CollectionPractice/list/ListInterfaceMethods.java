package CollectionPractice.list;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceMethods {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("AAA");
		list1.add("BBB");
		list1.add("CCC");
		System.out.println(list1);
		list1.add(1,"DDD");
		System.out.println(list1);
		list1.add(4,"EEE");
		System.out.println(list1);
		/// list1.add(6,"FFF");   index>size => will get java.lang.IndexOutOfBoundsException Exception
		System.out.println("--------------------------------------");

		String val = list1.set(2, "MMM");
		System.out.println(val);
		System.out.println(list1);
		// String val2 = list1.set(5, "MMM");  index>size-1 => will get java.lang.IndexOutOfBoundsException Exception
		System.out.println("--------------------------------------");
		List<String> list2 = new ArrayList<>();
		list2.add("AAA");
		list2.add("BBB");
		
		list2.addAll(1, list1);
		System.out.println(list2);
		
		System.out.println("--------------------------------------");
		list2.remove(2);
		System.out.println(list2);
		
		System.out.println("--------------------------------------");
		List<String> list3 = new ArrayList<>();
		list3.add("AAA");
		list3.add("KKK");
		list2.removeAll(list3);
		System.out.println(list2);
	}
}
