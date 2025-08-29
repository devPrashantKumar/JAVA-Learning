package org.thecodeexperience;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(EnumClass.data);
        System.out.println(EnumClass.MONDAY.data); // this is also working
        System.out.println(EnumClass.getStaticData());
        System.out.println(EnumClass.MONDAY.getStaticData());
        System.out.println(EnumClass.MONDAY.getData());
        EnumClass.TUESDAY.setData(25);

        System.out.println(EnumClass.data);
        System.out.println(EnumClass.getStaticData());
        System.out.println(EnumClass.MONDAY.getData());

        EnumClass.MONDAY.printEnums();
        System.out.println("----------------");
        EnumClass.printEnums2();

    }
}