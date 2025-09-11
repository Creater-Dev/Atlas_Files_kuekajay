public class Task001_CustNode_add_Traverse {

    static class Node { // Custom Node class
        int data;
        Node next;

        Node(int data) {  // Constructor to initialize data
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;     // Head of the list

    public void add(int data) {      //Method to add element at the end
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void traverse() {    // Method to traverse and display all elements
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {     // Main method to test the logic
        Task001_CustNode_add_Traverse list = new Task001_CustNode_add_Traverse();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.traverse();  // Output: Linked List: 10 -> 20 -> 30 -> 40 -> null
    }
}
