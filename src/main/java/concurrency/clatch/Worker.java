package concurrency.clatch;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread {
    int sleep;
    CountDownLatch latch;
    String name;
    public Worker(String name, int sleep, CountDownLatch latch){
        this.name = name;
        this.sleep = sleep;
        this.latch = latch;
    }

    public void run(){
        try
        {
            Thread.sleep(sleep);
            latch.countDown();
            System.out.println(Thread.currentThread().getName()
                            + " finished");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
