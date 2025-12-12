package con.thecodeexperience;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(5);
        Thread producer1 = new Thread(new Producer(sharedResource));
        Thread consumer1 = new Thread(new Consumer(sharedResource));
        Thread producer2 = new Thread(new Producer02(sharedResource));
        Thread consumer2 = new Thread(new Consumer02(sharedResource));

        consumer1.start();
        producer1.start();
        consumer2.start();
        producer2.start();
    }
}
