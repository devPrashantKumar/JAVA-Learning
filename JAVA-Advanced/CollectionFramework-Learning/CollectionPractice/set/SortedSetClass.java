package CollectionPractice.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetClass {

	public static void main(String[] args) {
		SortedSet<String> srt = new TreeSet<String>();
		srt.add("AAA");
		srt.add("DDD");
		srt.add("CCC");
		srt.add("BBB");
		//srt.add(null);  java.lang.NullPointerException null is not allowed
		System.out.println(srt);
		
		SortedSet srt1 = new TreeSet();
		srt1.add("AAA");
		srt1.add("DDD");
		//srt1.add(null); java.lang.NullPointerException null is not allowed
		//srt1.add(123);   // java.lang.ClassCastException:
		System.out.println(srt1);


	}

}
