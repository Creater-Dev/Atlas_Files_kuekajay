public class Node {
    int data;       // integer data
    Node next;      // reference to the next node

    // Constructor to initialize the node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Main method to test Node class
    public static void main(String[] args) {
        Node node1 = new Node(10);
        node1.next = new Node(20);
        Node node10 = new Node(30);
        System.out.println("Node data: " + node1.data);
        System.out.println("Node10 data: " + node10.data);
        System.out.println("Next node data: " + node1.next.data);
    }
}
