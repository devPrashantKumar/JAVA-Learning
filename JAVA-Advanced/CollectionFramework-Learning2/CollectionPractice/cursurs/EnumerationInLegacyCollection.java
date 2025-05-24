package CollectionPractice.cursurs;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationInLegacyCollection {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		
		Enumeration<Integer> em = vector.elements();
		while(em.hasMoreElements()) {
			em.nextElement();
			System.out.println(em.nextElement());
		}
		
		Enumeration<Integer> em2 = vector.elements();

		while(em2.hasMoreElements()) {
			em2.nextElement();
			System.out.println(em2.nextElement());
		}
		
	}

}
