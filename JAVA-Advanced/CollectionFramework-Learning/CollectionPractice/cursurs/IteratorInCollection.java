package CollectionPractice.cursurs;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInCollection {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		System.out.println(arrayList);
		Iterator<Integer> itr = arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
			// itr.remove();  remove can only be called once for each next. 
		}
		System.out.println(arrayList);
	}

}
