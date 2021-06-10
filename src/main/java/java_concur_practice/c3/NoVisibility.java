package java_concur_practice.c3;

public class NoVisibility {

    private static boolean ready;
    private static int n;

    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        n = 10;
        ready = true;
    }

    static class ReaderThread extends Thread {
        public void run(){
            while (!ready){
                System.out.println("Thread is not ready yet ...");
                    Thread.yield();
            }

            System.out.println("Number is " + n);
        }
    }
}
