package CollectionPractice.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetClass {

	public static void main(String[] args) {
		NavigableSet<String> nvst = new TreeSet<>();
		nvst.add("AAA");
		nvst.add("DDD");
		nvst.add("CCC");
		nvst.add("BBB");
		nvst.add("FFF");
		nvst.add("EEE");
		System.out.println(nvst);
		System.out.println(nvst.headSet("CCC"));
		System.out.println(nvst.tailSet("DDD"));
		System.out.println(nvst.subSet("BBB","DDD"));


	}

}
