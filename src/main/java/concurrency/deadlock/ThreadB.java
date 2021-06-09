package concurrency.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadB implements Runnable {
    Lock l = new ReentrantLock();

    @Override
    public void run() {

        DeadLockTest.lock.lock();
        System.out.println("Accuired Lock by B");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new ThreadC().run();

        System.out.println("Released Lock by B");
        DeadLockTest.lock.unlock();

    }
}
