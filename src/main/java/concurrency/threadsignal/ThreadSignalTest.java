package concurrency.threadsignal;

public class ThreadSignalTest {
    public static void main(String[] args) {
        MyWaitNotify not = new MyWaitNotify();
        not.doWait();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            not.doNotify();
        });
    }
}
