// Wap to create  a queue with custom methods
public class Task011_Queue_Custom_Circular {
    int[] queue;
    int front, rear, size, capacity;

    public Task011_Queue_Custom_Circular(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Enqueue: Add element to rear
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = value;
        size++;
        System.out.println("Enqueued: " + value);
    }

    // Dequeue: Remove element from front
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Dequeued: " + queue[front++]);
        front = front % capacity; // Circular increment
        size--;
    }

    // Peek: View front element
    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Front element: " + queue[front]);
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity; // Circular indexing
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Task011_Queue_Custom_Circular q = new Task011_Queue_Custom_Circular(5);

        q.display();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.peek();
        q.dequeue();
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70); // Should say queue is full
        q.display();
    }
}
