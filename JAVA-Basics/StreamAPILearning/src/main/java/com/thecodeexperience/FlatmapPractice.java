package com.thecodeexperience;

import java.util.List;
import java.util.stream.Stream;

public class FlatmapPractice {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(List.of(1,2,3,4),List.of(5,6,7,8),List.of(9,10,11,12));
        list.stream().flatMap(List::stream).forEach(System.out::println);
        System.out.println("-----------------");
        List<Integer> list2 = List.of(1,2,3,4,5);
        list2.stream().flatMap((e)-> Stream.of(e)).forEach(System.out::println);

        System.out.println("-----------------");
        List<List<String>> list3 = List.of(List.of("I","LOVE","JAVA"),List.of("CONCEPTS","ARE","CLEAR"),List.of("ITS","VERY","EASY"));
        list3.stream().flatMap((e)->e.stream()).forEach(System.out::println);
        System.out.println("-----------------");
        list3.stream().flatMap((e)->e.stream()).map(String::toLowerCase).forEach(System.out::println);
        System.out.println("-----------------");
        list3.stream().flatMap((e)->e.stream().map(String::toLowerCase)).forEach(System.out::println);
        System.out.println("-----------------");
        List<List<List<Integer>>> list4 = List.of(
                List.of(List.of(1,2,3,4),List.of(5,6,7,8),List.of(9,10,11,12)),
                List.of(List.of(1,2,3,4),List.of(5,6,7,8),List.of(9,10,11,12)));
        //list4.stream().flatMap(List::stream).forEach(System.out::println);
        list4.stream().flatMap(List::stream).flatMap(List::stream).forEach((e)->System.out.print(e+" "));
        System.out.println();
        list4.stream().flatMap((e)->e.stream().flatMap(List::stream)).forEach((e)->System.out.print(e+" "));
        System.out.println();
        System.out.println("-----------------");

    }
}
