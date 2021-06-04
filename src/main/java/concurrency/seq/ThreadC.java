package concurrency.seq;

public class ThreadC extends Thread {
    ResLock lock;

    public ThreadC(ResLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
//        System.out.println("running thread C");
        try {
            synchronized (lock) {
//                System.out.println("comes to C block");
                for (int i = 0; i < 10; i++) {

                    while (lock.flag != 3) {
                        lock.wait();
                    }

                    System.out.print("C ");
                    Thread.sleep(500);
                    lock.flag = 1;
                    lock.notifyAll();
                }

            }
        } catch (Exception e) {
            System.out.println("Exception 1 :" + e.getMessage());
        }

    }
}
