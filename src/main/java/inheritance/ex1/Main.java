package inheritance.ex1;

public class Main {
    public static void main(String[] args) {
        try {
            Class c  = Class.forName("inheritance.ex1.Job1");

            Job1 j = (Job1)c.newInstance();
            System.out.println(j);

            new Thread(j).start();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
