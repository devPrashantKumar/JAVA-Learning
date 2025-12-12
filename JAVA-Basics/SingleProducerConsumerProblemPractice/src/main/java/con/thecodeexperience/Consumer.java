package con.thecodeexperience;

public class Consumer implements Runnable{
    SharedResource sharedResource;

    Consumer(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                sharedResource.consume();
                Thread.sleep((int) (Math.random()*10));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
