package CollectionPractice.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class SampleClass{
	int sampleInt;
	String sampleString;
	
	public SampleClass(int sampleInt, String sampleString) {
		super();
		this.sampleInt = sampleInt;
		this.sampleString = sampleString;
	}
}

public class MapInterfaceMethods {
	public static void main(String[] args) {
		Map mp = new HashMap();
		mp.put(12, "Hello");
		mp.put("AAAA", 123);
		mp.put(1.89f,1.89f);
		mp.put(new SampleClass(1,"AAA"), new SampleClass(2,"BBB"));
		System.out.println(mp);
		
		System.out.println("--------------------------------------------");
		
		Map<String,String> mp1 = new HashMap<>();
		Map<String,String> mp2 = new HashMap<>();
		mp1.put("A","AAA");
		mp1.put("B","BBB");
		mp1.put("C","CCC");
		mp1.put("D","DDD");
		mp1.put("E","EEE");
		mp1.put("F","FFF");
		System.out.println(mp1);
		System.out.println(mp1.put("E", "GGG"));
		System.out.println(mp1.get("B"));
		System.out.println(mp1.remove("E"));
		System.out.println(mp1.isEmpty());
		mp2.putAll(mp1);
		System.out.println(mp2);
		mp1.clear();
		System.out.println(mp1.isEmpty());
		
		System.out.println("------------------------------");
		System.out.println(mp2);
		System.out.println(mp2.containsKey("A"));
		System.out.println(mp2.containsKey("X"));
		System.out.println(mp2.containsValue("BBB"));
		System.out.println(mp2.containsValue("XXX"));
		Set keys = mp2.keySet();
		System.out.println(keys);
		Collection values = mp2.values();
		System.out.println(values);






		

		

		


		

	}

}
