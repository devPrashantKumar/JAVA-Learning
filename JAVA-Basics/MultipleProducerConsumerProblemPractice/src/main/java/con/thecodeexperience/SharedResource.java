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
           System.out.println("buffer is empty, consumer is waiting"+" : "+Thread.currentThread().getName());
           wait();
       }
       System.out.println("item Consumed "+sharedBuffer.poll()+" : "+Thread.currentThread().getName());
       notifyAll();
    }

    public synchronized void produce(int data) throws InterruptedException {
        while(sharedBuffer.size()==bufferSize){
            System.out.println("buffer is full, producer is waiting"+" : "+Thread.currentThread().getName());
            wait();
        }
        System.out.println("item produces "+data+" "+sharedBuffer.add(data)+" : "+Thread.currentThread().getName());
        notifyAll();
    }

    /*
    Since notify() and notifyAll() randomly wake up threads that are waiting on this object’s monitor,
    it’s not always important that the condition is met. Sometimes the thread is woken up, but the condition isn’t actually satisfied yet.
    We can also define a check to save us from spurious wakeups — where a thread can wake up from waiting without ever having received a notification.
     */
}
