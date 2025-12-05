package com.thecodeexperience.staticMethodsInJAVA.inheritanceCheck;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        Hello hello  = new Hello();
        greeting.sayHello();
        hello.sayHello();

        // Static methods do not get inherited in the true OOP sense, but they are accessible in child classes.


    }
}
