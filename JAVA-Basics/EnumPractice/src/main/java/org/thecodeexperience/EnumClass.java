package org.thecodeexperience;

public enum EnumClass {
    MONDAY(10),TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    static int data=15;

    EnumClass(int data){
        data=data;
    }

    EnumClass(){
    }

    public int getData(){
        return data;
    }

    public void setData(int val){
        data=val;
    }


    public static int getStaticData() {
        return data;
    }



    public void printEnums(){
        for(EnumClass e: EnumClass.values()){
            System.out.println(e);
        }
    }

    public static void printEnums2(){
        for(EnumClass e: EnumClass.values()){
            System.out.println(e);
        }
    }
}
