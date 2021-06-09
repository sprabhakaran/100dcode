package concurrency.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadC implements Runnable {
    Lock l = new ReentrantLock();

    @Override
    public void run() {

        DeadLockTest.lock.lock();
        System.out.println("Accuired Lock by C");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new ThreadA().run();

        System.out.println("Released Lock by C");
        DeadLockTest.lock.unlock();

    }
}
