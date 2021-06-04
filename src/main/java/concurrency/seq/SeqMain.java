package concurrency.seq;

public class SeqMain {
    public static void main(String[] args) {
        ResLock l = new ResLock();

        ThreadA a = new ThreadA(l);
        ThreadB b = new ThreadB(l);
        ThreadC c = new ThreadC(l);

        a.start();
        b.start();
        c.start();
    }
}
