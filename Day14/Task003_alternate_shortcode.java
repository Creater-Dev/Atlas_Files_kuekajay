public class Task003_alternate_shortcode {
    static class Node {
        String data;
        Node next;
        Node(String data) { this.data = data; }
    }

    Node head = null, tail = null;

    void add(String data) {
        Node n = new Node(data);
        if (head == null) head = tail = n;
        else { tail.next = n; tail = n; }
        tail.next = head;
    }

    void traverse() {
        if (head == null) {
        System.out.println("List is empty.");
        return;
    }
        Node curr = head;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        Task003_alternate_shortcode list = new Task003_alternate_shortcode();
        for (String item : new String[]{"Apple", "Banana", "Cherry", "Mango", "Kiwi"})
            list.add(item);
        list.traverse();
    }
}
