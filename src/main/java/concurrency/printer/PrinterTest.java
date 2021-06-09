package concurrency.printer;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printerQueue = new Printer();
        Thread[] ts = new Thread[10];

        for (int i = 0; i < 10; i++) {
            ts[i] = new Thread(new PrinterJob(printerQueue));
        }

        for (int i = 0; i < 10; i++) {
            ts[i].start();
        }
        
    }
}
