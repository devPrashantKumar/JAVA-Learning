package CollectionPractice.list;

import java.util.Vector;

public class VectorClassMethods {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		System.out.println(vector.capacity());
		for(int i=1;i<=11;i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity()); // capacity double each time => 2*10 = 20
		System.out.println("--------------------------------------");
		Vector<Integer> vector2 = new Vector<>(11,5);
		System.out.println(vector2.capacity());
		for(int i=1;i<=12;i++) {
			vector2.add(i);
		}
		System.out.println(vector2.capacity()); // increase by 5 => 11+5=16
	}

}
