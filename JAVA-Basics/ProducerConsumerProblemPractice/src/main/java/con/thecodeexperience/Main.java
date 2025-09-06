package con.thecodeexperience;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(5);
        Thread producer = new Thread(new Producer(sharedResource));
        Thread consumer = new Thread(new Consumer(sharedResource));

        consumer.start();
        producer.start();
    }
}
