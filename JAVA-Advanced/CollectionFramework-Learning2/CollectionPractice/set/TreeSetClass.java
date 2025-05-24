package CollectionPractice.set;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("AAA");
		ts.add("DDD");
		ts.add("CCC");
		ts.add("BBB");
		ts.add("FFF");
		ts.add("EEE");
		System.out.println(ts);
		System.out.println(ts.headSet("CCC"));
		System.out.println(ts.tailSet("DDD"));
		System.out.println(ts.subSet("BBB","DDD"));
		System.out.println("-----------------------------------------------");

		SortedSet<String> srt = new TreeSet<String>();
		srt.add("AAA");
		srt.add("DDD");
		srt.add("CCC");
		srt.add("BBB");
		System.out.println(srt);
		TreeSet<String> ts2 = new TreeSet<>(srt);
		System.out.println(ts2);
		
		System.out.println("-----------------------------------------------");
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("DDD");
		list.add("CCC");
		list.add("BBB");
		System.out.println(list);
		TreeSet<String> ts3 = new TreeSet<>(srt);
		System.out.println(ts3);
		
		System.out.println("-----------------------------------------------");
		TreeSet ts4 = new TreeSet();
		ts4.add("AAA");
		ts4.add("DDD");
		ts4.add("CCC");
		ts4.add("BBB");
		ts4.add("FFF");
		ts4.add("EEE");
		// ts4.add(10);   java.lang.ClassCastException
		//ts4.add(null);   java.lang.NullPointerException
		// ts4.add(new StringBuffer("Hello")); java.lang.ClassCastException:
		System.out.println(ts4);






	}

}
