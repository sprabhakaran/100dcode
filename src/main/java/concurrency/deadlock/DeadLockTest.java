package concurrency.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockTest {

    public static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        System.out.println("Start");
        new Thread(new ThreadA()).start();
        System.out.println("End ...");
    }

}
