package concurrency.seq;

public class ThreadB extends Thread {
    ResLock lock;

    public ThreadB(ResLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
//        System.out.println("running thread B");
        try {
            synchronized (lock) {
//                System.out.println("comes to B block");
                for (int i = 0; i < 10; i++) {

                    while (lock.flag != 2) {
                        lock.wait();
                    }

                    System.out.print("B ");
                    Thread.sleep(500);
                    lock.flag = 3;
                    lock.notifyAll();
                }

            }
        } catch (Exception e) {
            System.out.println("Exception 1 :" + e.getMessage());
        }

    }
}
