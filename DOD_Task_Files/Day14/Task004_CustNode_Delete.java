class Node {

    int value;
    Node nextNode;

    public Node(int value) {
        this.value = value;
    }
}

public class Task004_CustNode_Delete {

    public static class CircularLinkedList {
        // if the list is empty
        private Node head = null;
        private Node tail = null;

        public void addNode(int value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
            } else {
                tail.nextNode = newNode;
            }

            tail = newNode;
            tail.nextNode = head;
        }

        public boolean containsNode(int searchValue) {
            Node currentNode = head;

            if (head == null) {
                return false;
            } else {
                do {
                    if (currentNode.value == searchValue) {
                        return true;
                    }
                    currentNode = currentNode.nextNode;
                } while (currentNode != head);
                return false;
            }
        }

        public void deleteNode(int valueToDelete) {
            Node currentNode = head;
            if (head == null) { // the list is empty
                return;
            }
            do {
                Node nextNode = currentNode.nextNode;
                if (nextNode.value == valueToDelete) {
                    if (tail == head) { // the list has only one single element
                        head = null;
                        tail = null;
                    } else {
                        currentNode.nextNode = nextNode.nextNode;
                        if (head == nextNode) { //we're deleting the head
                            head = head.nextNode;
                        }
                        if (tail == nextNode) { //we're deleting the tail
                            tail = currentNode;
                        }
                    }
                    break;
                }
                currentNode = nextNode;
            } while (currentNode != head);
        }

        public void printList() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            Node currentNode = head;
            do {
                System.out.print(currentNode.value + " ");
                currentNode = currentNode.nextNode;
            } while (currentNode != head);
            System.out.println();
        }
    }

    private static CircularLinkedList createCircularLinkedList() {
        CircularLinkedList cll = new CircularLinkedList();

        cll.addNode(13);
        cll.addNode(7);
        cll.addNode(24);
        cll.addNode(1);
        cll.addNode(8);
        cll.addNode(37);
        cll.addNode(46);

        return cll;
    }

    public static void main(String[] args) {
        CircularLinkedList cll = createCircularLinkedList();
        System.out.print("Initial list: ");
        cll.printList();

        int valueToDelete = 24;
        System.out.println("Deleting value: " + valueToDelete);
        cll.deleteNode(valueToDelete);
        System.out.print("List after deletion: ");
        cll.printList();

        int searchValue = 8;
        System.out.println("Contains " + searchValue + "? " + cll.containsNode(searchValue));
    }
}
// Output:
// Initial list: 13 7 24 1 8 37 46
// Deleting value: 24
// List after deletion: 13 7 1 8 37 46
// Contains 8? true
// Contains 24? false
