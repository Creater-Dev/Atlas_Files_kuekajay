class RunnableDemo implements Runnable { // Implements the Runnable interface
    private Thread t; // Thread object
    private String threadName;  // Name of the thread

    RunnableDemo(String name) {  // Constructor to initialize the thread name
        threadName = name;      
        System.out.println("Creating " + threadName); // Print thread creation message
    }

    public void run() {   //predefined run method from Runnable interface
        // This method is called when the thread is started
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");

    }

    public void start() { //predefined start method from Thread class
        // This method is used to start the thread
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class TestThread { // Main class to test the RunnableDemo class
    public static void main(String args[]) {  // Main method
        RunnableDemo R1 = new RunnableDemo("Thread-1"); // Create first thread, memory will bw allocated
        R1.start();                                          // Start the first thread
        RunnableDemo R2 = new RunnableDemo("Thread-2"); // Create second thread
        R2.start();                                          // Start the second thread              
    }
}
