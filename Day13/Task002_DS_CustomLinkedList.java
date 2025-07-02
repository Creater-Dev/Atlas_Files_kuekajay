import java.util.*;

// try to add element in the list
public class Task002_DS_CustomLinkedList<T> {
    // create a node
    class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private int size = 0;

    // Add at the end
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Add at the beginning
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Remove from the beginning
    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        T removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }
    // Remove from the end (not defined in the original code, but mentioned)

    // Get element at index
    public T get(int index) {
        checkBounds(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Size of the list
    public int size() {
        return size;
    }

    // Check if index is valid
    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // Add element at a specific index
    public void addAt(int index, T data) {
        checkBounds(index);

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node<T> newNode = new Node<>(data);
        Node<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        System.out.println("After adding " + data + " at index: " + index);

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    // Remove element at a specific index
    public T removeAt(int index) {
        System.out.println("After Deleting element at index: " + index);
        checkBounds(index);

        if (index == 0) {
            return removeFirst();
        }

        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        T removedData = current.next.data;
        current.next = current.next.next;
        size--;
        return removedData;

    }

    // Print all elements in the list
    public void printElements() {
        Node<T> current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.println("null");
        System.out.println("Size of the list: " + size);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Task002_DS_CustomLinkedList<String> list = new Task002_DS_CustomLinkedList<>();

        list.add("Apple");
        list.add("Banana");

        System.out.println("Elements in the list:");
        list.printElements(); // Apple → Banana → null

        list.addFirst("Orange");
        list.add("Grapes");

        System.out.println("After adding 1st & last Elements in the list:");
        list.printElements(); // Orange → Apple → Banana → Grapes → null

        list.removeFirst(); // Removes Orange
        System.out.println("After removing first element:");
        list.printElements();// Apple → Banana → Grapes → null

        list.addAt(2, "Mango"); // Adds Mango at index 2
        list.printElements(); // Apple → Mango → Banana → Grapes → null

        list.removeAt(0); // Removes Apple
        list.printElements(); // Mango → Banana → Grapes → null

        list.add("Pineapple"); // Adds Pineapple at the end
        list.printElements();

        list.addAt(5, "Kiwi"); // This will throw an exception since index 5 is out of bounds

    }

}
