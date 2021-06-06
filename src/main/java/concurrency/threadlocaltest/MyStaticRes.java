package concurrency.threadlocaltest;

public class MyStaticRes {
    private static ThreadLocal tl = new ThreadLocal();

    public static void setName(String set){
        tl.set(set);
    }

    public static String get(){
        return (String)tl.get();
    }
}
