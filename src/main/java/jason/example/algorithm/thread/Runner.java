package jason.example.algorithm.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner implements Runnable {
    private final int maxCount;
    private final Counter counter;

    public Runner(int maxCount, Counter counter) {
        this.maxCount = maxCount;
        this.counter = counter;
    }

    //
    // @Override
    // public void run() {
    // for (int i = 0; i < this.maxCount; i++) {
    // int currentCount = counter.count();
    // System.out.println(Thread.currentThread().getName()
    // + " at count " + currentCount);
    // }
    // }

    @Override
    public void run() {
        for (int i = 0; i < maxCount; i++) {
            int currentCount = counter.getNextCount();

            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println(Thread.currentThread().getName() + ": " + dateFormat.format(date) + ": count=" + currentCount);
        }
    }
}
