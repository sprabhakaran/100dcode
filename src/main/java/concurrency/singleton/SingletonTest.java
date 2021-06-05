package concurrency.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        for (int i=0; i<100; i++) {
            new Job().start();
        }
    }

    static class Job extends Thread {
        public void run(){
            SafeSingleton s = SafeSingleton.getInstance();
            System.out.println("new obj created!!");
        }
    }
}


class SafeSingleton {

    private static SafeSingleton obj = null;

    public static SafeSingleton getInstance() {
        if (obj == null){
            synchronized (SafeSingleton.class){
                if (obj == null) { //double null check here ...
                    System.out.println("initialized one time ...");
                    obj = new SafeSingleton();
                }
            }
        }
        return obj;
    }
}


