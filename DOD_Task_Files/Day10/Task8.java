import java.util.concurrent.locks.Lock; // Importing Lock for thread safety
import java.util.concurrent.locks.ReentrantLock; // Using ReentrantLock for thread safety

class Counter {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}


class ThreadDemo extends Thread {
    Counter counter;

    ThreadDemo(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        Counter counter = new Counter(); // creating a shared resource
         // Using ReentrantLock for thread safety
        ThreadDemo t1 = new ThreadDemo(counter);  // creating thread t1
        ThreadDemo t2 = new ThreadDemo(counter);  // creating thread t2

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}