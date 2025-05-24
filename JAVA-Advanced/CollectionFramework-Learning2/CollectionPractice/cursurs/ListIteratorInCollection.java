package CollectionPractice.cursurs;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorInCollection {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("AAA");
		arrayList.add("BBB");
		arrayList.add("CCC");
		arrayList.add("DDD");
		
		System.out.println(arrayList);
		
		ListIterator<String> listItr = arrayList.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.nextIndex()  + " --> "+ listItr.next());
		}
		System.out.println("------------------------------");
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previousIndex()  + " --> "+ listItr.previous());
		}
		System.out.println("------------------------------");
		System.out.println(arrayList);
		while(listItr.hasNext()) {
			int index = listItr.nextIndex();
			System.out.println( listItr.nextIndex() + " --> "+ listItr.next());
			if(index==2) {
				System.out.println("I am here 1");
				listItr.add("MMM");
			}
			else if(index==1) {
				System.out.println("I am here 2");
				listItr.set("NNN");
			}
			else if(index==3) {  // index=3 is added later but when it got inserted cursur already passed that index so index==3 will never satisfy
				System.out.println("I am here 3");
				listItr.remove();
			}
			else if(index==4) {
				System.out.println("I am here 4");
				listItr.remove();
			}
		}
		System.out.println(arrayList);

		System.out.println("------------------------------");
		System.out.println(arrayList);
		while(listItr.hasPrevious()) {
			int index = listItr.previousIndex();
			System.out.println(listItr.previousIndex()  + " --> "+ listItr.previous());
//			if(index==2) {
//				System.out.println("I am here 1");
//				listItr.add("XXX");  // will go in infinite because insertion happen before cursure so every time element will we added at index 2
//			}
			if(index==1) {
				System.out.println("I am here 2");
				listItr.set("YYY");
			}
			else if(index==2) { 
				System.out.println("I am here 3");
				listItr.remove();
			}
		}
		System.out.println(arrayList);

	}

}
