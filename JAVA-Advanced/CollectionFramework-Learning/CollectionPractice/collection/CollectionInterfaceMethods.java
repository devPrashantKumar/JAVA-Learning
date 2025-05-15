package CollectionPractice.collection;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionInterfaceMethods {

	public static void main(String[] args) {
		System.out.println("Hello World");
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("AAA");
		hs1.add("BBB");
		hs1.add("CCC");
		HashSet<String> hs2 = new HashSet<String>();
		System.out.println(hs1.addAll(hs2)); // no element is in  hs2 so addAll will return false;
		hs2.add("AAA");
		System.out.println(hs2.addAll(hs1)); // atleast one element is getting inserted in hs2 so adddAll will return true;
		
		System.out.println("--------------------------------------------------------");		
		ArrayList<String> arrayList1 = new ArrayList<>();
		arrayList1.add("AAA");
		arrayList1.add("BBB");
		arrayList1.add("CCC");
		System.out.println(arrayList1);
		System.out.println(arrayList1.remove("AAA"));
		System.out.println(arrayList1);
		System.out.println(arrayList1.remove("ZZZ"));
		System.out.println(arrayList1);
		ArrayList<String> arrayList2 = new ArrayList<>();
		System.out.println(arrayList2.removeAll(arrayList1)); // no element is removed so removeAll will return false;
		arrayList2.add("BBB");
		System.out.println(arrayList2.removeAll(arrayList1)); // atleast one element is getting removed so removeAll will return true;
		System.out.println(arrayList1);
		System.out.println(arrayList2);
		
		System.out.println("--------------------------------------------------------");		
		ArrayList<String> arrayList3 = new ArrayList<>();
		arrayList3.add("AAA");
		arrayList3.add("BBB");
		arrayList3.add("CCC");
		System.out.println(arrayList3);
		System.out.println(arrayList3.contains("AAA"));
		ArrayList<String> arrayList4 = new ArrayList<>();
		arrayList4.add("AAA");
		arrayList4.add("BBB");
		System.out.println(arrayList4);
		System.out.println(arrayList3.containsAll(arrayList4)); // all element of array4 are available in array3
		arrayList4.add("ZZZ");
		System.out.println(arrayList4);
		System.out.println(arrayList3.containsAll(arrayList4)); // atleast one element of array4 is not available in array3
		
		System.out.println("--------------------------------------------------------");		
		ArrayList<String> arrayList5 = new ArrayList<>();
		arrayList5.add("AAA");
		arrayList5.add("BBB");
		arrayList5.add("CCC");
		System.out.println(arrayList5);
		ArrayList<String> arrayList6 = new ArrayList<>();
		arrayList6.add("AAA");
		arrayList6.add("BBB");
		System.out.println(arrayList6);
		System.out.println(arrayList5.retainAll(arrayList6)); // during this retainAll removed one element "CCC" from arrayList5 so retainAll will return true
		System.out.println(arrayList5);
		System.out.println(arrayList5.retainAll(arrayList6)); //no element removed so retainAll will return false
		System.out.println(arrayList5);
		
		System.out.println("--------------------------------------------------------");		
		System.out.println(arrayList5.size());
		
		System.out.println("--------------------------------------------------------");		
		Object[] arr = arrayList5.toArray();
		System.out.println(arr);  // will print reference value of arr
		System.out.println(Arrays.toString(arr)); // will print Elements of arr, all value are constants no one is reference value
		
		System.out.println("--------------------------------------------------------");	
		System.out.println(arrayList5.isEmpty());
		arrayList5.clear();
		System.out.println(arrayList5.isEmpty());
	}

}
