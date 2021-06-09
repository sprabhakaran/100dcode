package concurrency.printer;

public class PrinterJob implements Runnable {
    Printer queue;
    public PrinterJob(Printer queue){
        this.queue = queue;
    }

    @Override
    public void run() {
//        System.out.println("Printing :: " + queue);
        queue.printJob(new Object());
    }
}
