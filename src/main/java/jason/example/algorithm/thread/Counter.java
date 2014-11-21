package jason.example.algorithm.thread;

public class Counter {

    private int count = 0;

    public synchronized int getNextCount() {
        return ++this.count;
    }
}
