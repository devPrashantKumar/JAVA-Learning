package con.thecodeexperience;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    Queue<Integer> sharedBuffer;
    int bufferSize;

    public SharedResource(int bufferSize){
        this.sharedBuffer = new LinkedList<>();
        this.bufferSize=bufferSize;
    }

    public synchronized void consume() throws InterruptedException {
       while(sharedBuffer.isEmpty()){
           System.out.println("buffer is empty, consumer is waiting");
           wait();
       }
       System.out.println("item Consumed "+sharedBuffer.poll());
       notifyAll();
    }

    public synchronized void produce(int data) throws InterruptedException {
        while(sharedBuffer.size()==bufferSize){
            System.out.println("buffer is full, producer is waiting");
            wait();
        }
        System.out.println("item produces "+data+" "+sharedBuffer.add(data));
        notifyAll();
    }
}
