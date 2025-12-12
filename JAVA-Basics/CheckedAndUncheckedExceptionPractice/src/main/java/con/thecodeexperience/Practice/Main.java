package con.thecodeexperience.Practice;

public class Main {
    public static void main(String[] args) {
        sayHello01();
        sayHello02(); // unchecked exception mandatory to handle
    }

    public static void sayHello01(){
        throw new RuntimeException01("run time exception occurred");
    }

    public static void sayHello02() throws Exception {
        throw new Exception01("run time exception occurred");
    }
}
