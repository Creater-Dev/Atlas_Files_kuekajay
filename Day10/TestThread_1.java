class ThreadDemo extends Thread { // Extending Thread class
    private String threadName; // Name of the thread

    ThreadDemo(String name) { // Constructor
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() { // Overriding the run method
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}

public class TestThread_1 {
    public static void main(String args[]) {
        ThreadDemo T1 = new ThreadDemo("Thread-1"); // Thread-1
        T1.start(); // Start Thread-1

        ThreadDemo T2 = new ThreadDemo("Thread-2"); // Thread-2
        T2.start(); // Start Thread-2
    }
}
