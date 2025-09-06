package con.thecodeexperience;

public class Producer implements Runnable{
    SharedResource sharedResource;

    Producer(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                sharedResource.produce(i);
                Thread.sleep((int) (Math.random()*10));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
