package con.thecodeexperience;

public class Producer02 implements Runnable{
    SharedResource sharedResource;

    Producer02(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
        for(int i=10;i<20;i++){
            try {
                sharedResource.produce(i);
                Thread.sleep((int) (Math.random()*10));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
