package concurrency;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MorningHabit {
    public static void main(String[] args) {

        Thread t = new Thread(new DailyRoutine());
        t.start();

        System.out.println("Process is done ...");
    }
}

class DailyRoutine implements Runnable {

    @Override
    public void run() {
        System.out.println("daily routine started ... " + Thread.currentThread().getName());
        new WakeUp().run();

        System.out.println("daily routine job ended ... " + Thread.currentThread().getName());

        // Take bath
    }
}


class WakeUp implements Runnable {

    @Override
    public void run() {
        System.out.println("jack is woke up");
        new Brush().run();
    }
}

class Brush implements Runnable {

    @Override
    public void run() {
        System.out.println("Taking paste and brush ... takes 5 seconds");
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("He did brush");
        new DrinkCoffee().run();
    }
}

class DrinkCoffee implements Runnable {

    @Override
    public void run() {
        try {

            Coffee c = new AskCoffee().call();
            c.drink();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class AskCoffee implements Callable<Coffee> {

    @Override
    public Coffee call() throws Exception {
        System.out.println("Asking coffee to mom");
        System.out.println("mom preparing coffee, takes 4 seconds");
        Thread.sleep(4 * 1000);
        System.out.println("mom prepared coffee ...");
        return new Coffee();
    }
}

class Coffee {

    public void drink(){
        System.out.println("jack drinking coffe ...");
    }

}