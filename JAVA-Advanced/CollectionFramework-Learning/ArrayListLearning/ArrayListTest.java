package ArrayListLearning;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(1,4);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(Integer.valueOf(5));
        
        /*
        4 Exception in thread "main" java.util.ConcurrentModificationException
        at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
        at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
        at ArrayListLearning.ArrayListTest.main(ArrayListTest.java:22)
        for(Integer element: list){
            System.out.print(element+" ");
            list.add(10);
        }
        */

        /*
        this will not give ConcurrentModificationException 
        because here we are not using iterator to iterate.
        */
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
            if(i==0){
                list.add(10);
            }
        }
    }
}
