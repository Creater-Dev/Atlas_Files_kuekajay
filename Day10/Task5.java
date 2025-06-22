//- synchronized, only one thread can enter the method at a time.
//- The join() method ensures that main waits until t1 and t2 complete their tasks.

class Counter { 
    private int count = 0;

    public synchronized void increment() { 
        count++; 
    }

    public synchronized int getCount() { 
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

public class Task5 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadDemo t1 = new ThreadDemo(counter);
        ThreadDemo t2 = new ThreadDemo(counter);

        t1.start(); //predefined method to start the thread
        t2.start(); //predefined method to start the thread

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}