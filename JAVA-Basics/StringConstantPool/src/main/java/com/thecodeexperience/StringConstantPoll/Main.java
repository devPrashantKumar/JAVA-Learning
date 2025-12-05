package com.thecodeexperience.StringConstantPoll;

public class Main {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);  // both are pointing to same string literal
        System.out.println(s1.equals(s2));  // both are pointing to same string literal
        String s3 = new String("hello");
        System.out.println(s1==s3);  // both are pointing to different address, new object created for s3 in heap memory
        System.out.println(s1.equals(s3));

    }
}
