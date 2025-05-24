package CollectionPractice.map;

import java.util.HashMap;
import java.util.Objects;

class Employee{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee std = (Employee) obj;
		if(this.id==std.id && this.name==std.name) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
	    return Objects.hash(id, name);
	}
};

public class HashMapClass {
	
	
	public static void main(String[] args) {
		HashMap<Employee,String> hmp = new HashMap<>();
		hmp.put(new Employee(1,"A"), "AAAA");
		hmp.put(new Employee(1,"A"), "BBB");   
		// second employee key is overridding first employees key due to equals method
		// hashmap compare keys using equals method;
		// to compare keys using == operator we have IdentityMap
		System.out.println(hmp);

	}

}
