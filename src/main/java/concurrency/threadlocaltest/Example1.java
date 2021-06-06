package concurrency.threadlocaltest;

public class Example1 {
    static ThreadLocal tl = new ThreadLocal();
    public static void main(String[] args) {

        new Thread(()->{
            MyStaticRes.setName("First Value");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("First values is : "+MyStaticRes.get());
        }).start();

        new Thread(()->{
           MyStaticRes.setName("Second value");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("second value is :: "+MyStaticRes.get());
        }).start();
    }
}
