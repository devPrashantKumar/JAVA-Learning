package CollectionPractice.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		LinkedHashSet<String> hs1 = new LinkedHashSet<>();
		hs1.add("AAA");
		hs1.add("DDD");
		hs1.add("CCC");
		hs1.add("BBB");
		System.out.println(hs1);  // insertion order maintained

	}

}
