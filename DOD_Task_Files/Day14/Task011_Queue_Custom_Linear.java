public class Task011_Queue_Custom_Linear {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    // Constructor to initialize the queue
    public Task011_Queue_Custom_Linear(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Add an element to the rear of the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        queue[++rear] = value;
        System.out.println("Enqueued: " + value);
    }

    // Remove an element from the front of the queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        System.out.println("Dequeued: " + queue[front++]);
    }

    // View the element at the front without removing it
    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Front element: " + queue[front]);
    }

    // Display all elements from front to rear
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Test the custom queue
    public static void main(String[] args) {
        Task011_Queue_Custom_Linear q = new Task011_Queue_Custom_Linear(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.peek();
        q.dequeue();
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // should trigger "full" message
        q.display();
    }
}
