package com.thecodeexperience.staticMethodsInJAVA.MethodHidingCheck;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Car car = new Car();
        car.start();

        Vehicle vehicle2 = new Car();
        vehicle2.start();

        /*Static methods → method hiding
         * No polymorphism
         * Call depends on the reference type, not object type
         */
    }
}
