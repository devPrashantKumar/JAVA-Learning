package com.thecodeexperience;

import java.util.List;
import java.util.stream.Stream;

public class LazySreamsPractice {
    public static void main(String[] args) {
        List<List<String>> list3 = List.of(List.of("I","LOVE","JAVA"),List.of("CONCEPTS","ARE","CLEAR"),List.of("ITS","VERY","EASY"));
        Stream<String> listStream = list3.stream().flatMap(List::stream).peek(System.out::println);
        System.out.println("before calling terminal operation");
        listStream.count();
        System.out.println("after calling terminal operation");



    }
}
