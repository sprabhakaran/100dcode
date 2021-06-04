package concurrency.clatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        Worker w1 = new Worker("w1", 1000, latch);
        Worker w2 = new Worker("w2", 2000, latch);
        Worker w3 = new Worker("w3", 3000, latch);

        w1.start();
        w2.start();
        w3.start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main task is running after thread started ...");

    }
}
