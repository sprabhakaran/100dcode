package concurrency.threadlocaltest;

public class InheritableThreadLocalTest {

    static ThreadLocal<String> tl = new ThreadLocal<>();

    static InheritableThreadLocal itl = new InheritableThreadLocal();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            tl.set("First thread value");
            itl.set("First inheritable thread value");

            Thread innerTL = new Thread(() -> {
                System.out.println("Parent thread :: " + tl.get());
                System.out.println("Parent inheritable thread :: " + itl.get());
            });

            innerTL.start();

        });

        t1.start();

    }

}
