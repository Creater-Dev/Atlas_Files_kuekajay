public class Task003_CustNode_circular_Task001 {

    static class Node { // Custom Node class
        String data; // Data of the node
        Node next; //reference to the next node

        Node(String data) { // Constructor to initialize data
            this.data = data;
            this.next = null;
        }
    }

    Node head = null; // Head of the circular linked list
    Node tail = null; // Tail of the circular linked list

    public void add(String data) { //Add an element to the circular linked list
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;  //head = tail = newNode;
            tail = newNode;
            newNode.next = head; // Point to itself (circular)
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Maintain circular link
        }
    }

    public void traverse() { //Traverse the circular linked list
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);

        System.out.println("(back to head)");
    }

    // Main method to test the circular list
    public static void main(String[] args) {
        Task003_CustNode_circular_Task001 list = new Task003_CustNode_circular_Task001();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        list.add("Kiwi");

        list.traverse();  // Output: Circular Linked List: Apple -> Banana -> Cherry -> Mango -> Kiwi -> (back to head)
    }
}
