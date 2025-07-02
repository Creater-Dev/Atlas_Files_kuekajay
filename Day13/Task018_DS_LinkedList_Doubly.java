//Wap to create a doubly linked list
public class Task018_DS_LinkedList_Doubly {
    class Node {
    int data;
    Node prev;
    Node next;

    public Node(int value) {
        data = value;
        prev = null;
        next = null;
    }
}
    private Node head;
    private Node tail;

    // Append at end using tail
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Insert at beginning using head
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Forward traversal
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Backward traversal
    public void displayBackward() {
        Node temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Task018_DS_LinkedList_Doubly dll = new Task018_DS_LinkedList_Doubly();

        dll.append(100);
        dll.append(200);
        dll.prepend(50);
        dll.append(300);

        dll.displayForward();   // 50 <-> 100 <-> 200 <-> 300 <-> NULL
        dll.displayBackward();  // 300 <-> 200 <-> 100 <-> 50 <-> NULL
    }
}

