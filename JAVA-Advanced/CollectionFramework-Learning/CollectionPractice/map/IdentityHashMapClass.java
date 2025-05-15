package CollectionPractice.map;

import java.util.IdentityHashMap;
import java.util.Objects;

class Student{
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj;
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

public class IdentityHashMapClass {
	
	
	public static void main(String[] args) {
		IdentityHashMap<Student,String> idhmp = new IdentityHashMap<>();
		idhmp.put(new Student(1,"A"), "AAAA");
		idhmp.put(new Student(1,"A"), "BBB");   
		// to compare keys using == operator we have IdentityMap
		// in this each student object will we considered as a unique key 
		System.out.println(idhmp);

	}

}
