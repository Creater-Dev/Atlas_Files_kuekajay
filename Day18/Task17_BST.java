import java.util.*;

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class Task17_BST {
    Node root;

    void printCorner(Node root) {
        Queue<Node> q = new LinkedList<Node>();

        q.add(root);
        // level order traversal
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node temp = q.poll(); // retrieve and remove the node

                // Print the corner nodes (first or last node in the level)
                if (i == 0 || i == n - 1)
                    System.out.print(temp.key + "  ");

                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Task17_BST tree = new Task17_BST(); // Fixed class name
        tree.root = new Node(11);
        tree.root.left = new Node(22);
        tree.root.right = new Node(33);
        tree.root.left.left = new Node(44);
        tree.root.left.right = new Node(55);
        tree.root.right.left = new Node(66);
        tree.root.right.right = new Node(77);

        tree.printCorner(tree.root);
    }
}
