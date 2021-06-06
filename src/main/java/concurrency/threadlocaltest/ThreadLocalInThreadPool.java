package concurrency.threadlocaltest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalInThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 4; i++) {
            service.execute(new Task1(i));
        }

    }
}

class Task1 extends Thread {
    int i;
    public Task1(int i){
        this.i = i;
    }

    public void run() {
        System.out.println("i :;" + i);
        MyStaticRes.setName("my thread " + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i + " My current result is " + MyStaticRes.get());
    }

}
