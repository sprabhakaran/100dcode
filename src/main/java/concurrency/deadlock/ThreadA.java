package concurrency.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadA implements Runnable {

    @Override
    public void run() {

        DeadLockTest.lock.lock();
        System.out.println("Accuired Lock by A");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new ThreadB().run();

        System.out.println("Released Lock by A");
        DeadLockTest.lock.unlock();

    }
}
