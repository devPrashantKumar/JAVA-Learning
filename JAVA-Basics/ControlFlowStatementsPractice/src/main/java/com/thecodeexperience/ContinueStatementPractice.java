package com.thecodeexperience;

public class ContinueStatementPractice {
    public static void main(String[] args) {
        int i=0;
//      this will go in infinite loop
//        while(i<5){
//            System.out.println("before continue");
//            if(i==3) continue;
//            System.out.println("i -> "+i++);
//        }

        while(i<5){
            System.out.println("before continue");
            if(i==3) {
                i++;
                continue;
            }
            System.out.println("i -> "+i++);
        }
    }
}
