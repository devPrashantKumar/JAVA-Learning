package CollectionPractice.map;

import java.util.HashMap;
import java.util.WeakHashMap;

class WeakHashMapClass1{
	@Override
	public String toString() {
		return "A";
	}
}

public class WeakHashMapClass {

	public static void main(String[] args) {
		WeakHashMapClass1 a1 = new WeakHashMapClass1();
		WeakHashMapClass1 a2 = new WeakHashMapClass1();
		WeakHashMapClass1 a3 = new WeakHashMapClass1();
		WeakHashMapClass1 a4 = new WeakHashMapClass1();
		HashMap hmp = new HashMap();
		hmp.put(a1,"AAA");
		hmp.put(a2,"BBB");
		System.out.println("hmp : "+hmp);
		WeakHashMap whmp = new WeakHashMap();
		whmp.put(a3, "CCC");
		whmp.put(a4, "DDD");
		System.out.println("whmp : "+whmp);

		a1 = null;
		a3=null;
		System.gc();
		System.out.println("hmp : "+hmp);
		System.out.println("whmp : "+whmp); 
		//in weak hash map, key will we removed if its object is not referenced by other reference variable

		
		

	}

}
