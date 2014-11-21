package jason.example.algorithm.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPool {
    public final static int MAX_THREADS = 5;

    public static void main(String[] args) throws InterruptedException {

        // ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //
        // Counter counter = new Counter();
        // System.out.println("Current time = " + new Date());
        // for (int i = 0; i < 3; i++) {
        // Thread.sleep(500);
        // Runner runner = new Runner(1, counter);
        // scheduledThreadPool.schedule(runner, 100, TimeUnit.MILLISECONDS);
        // }
        //
        // Thread.sleep(5000);
        //
        // scheduledThreadPool.shutdown();
        // while (!scheduledThreadPool.isTerminated()) {
        // System.out.println("waiting to shutdown...");
        // Thread.sleep(1000);
        // }
        // System.out.println("All done.  Shutdown.");
        // }

        ScheduledExecutorService sched = Executors.newScheduledThreadPool(MAX_THREADS);
        for (int i = 0; i < MAX_THREADS; i++) {
            Counter counter = new Counter();
            Runner runner = new Runner(10, counter);
            sched.schedule(runner, 1, TimeUnit.SECONDS);
            Thread.sleep(1000);
        }
        Thread.sleep(3000);
        sched.shutdown();
        while (!sched.isTerminated()) {
            System.out.println("Waiting to shutdown...");
        }
        System.out.println("DONE!");
    }
}
