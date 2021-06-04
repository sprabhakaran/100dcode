package concurrency.seq;

public class ThreadA extends Thread {
    ResLock lock;

    public ThreadA(ResLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
//        System.out.println("running thread A");
        try {
            synchronized (lock) {
//                System.out.println("comes to A block");
                for (int i = 0; i < 10; i++) {

                    while (lock.flag != 1) {
                        lock.wait();
                    }

                    System.out.print("A ");
                    Thread.sleep(500);
//                    System.out.println("Slept A");
                    lock.flag = 2;
                    lock.notifyAll();
                }

            }
        } catch (Exception e) {
            System.out.println("Exception 1 :" + e.getMessage());
        }

    }
}
