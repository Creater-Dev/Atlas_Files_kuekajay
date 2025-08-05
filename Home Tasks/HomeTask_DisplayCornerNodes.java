import java.util.ArrayDeque;
import java.util.Queue;

class Node {
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}

public class HomeTask_DisplayCornerNodes {

    public static void print(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node curr = q.peek();
                q.poll();
                // Print the first or last node of the current level
                if (i == 0 || i == size - 1) {
                    System.out.print(curr.data + " ");
                }
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            System.out.println();
        }
    }

    // Non editable starts here
    public static void main(String[] args) {
        // Replace Scanner input with hardcoded elements
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);
        root.right.left.left = new Node(8);
        root.right.left.right = new Node(9);
        root.right.right.right = new Node(10);

        print(root);
    }
    // Non editable ends here
}
