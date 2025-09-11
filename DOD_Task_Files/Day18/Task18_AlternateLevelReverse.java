import java.util.*;

class Node {
    char data;
    Node left, right;

    Node(char data) {
        this.data = data;
        left = right = null;
    }
}

public class Task18_AlternateLevelReverse {

    // Function to print level order with alternate levels reversed
    static void printSpiral(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        boolean reverse = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Character> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                level.add(node.data);

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            // Print current level
            if (reverse) {
                Collections.reverse(level);
            }

            for (char ch : level) {
                System.out.print(ch + " ");
            }

            reverse = !reverse; // toggle for next level
        }
    }

    public static void main(String[] args) {
        // Build tree from first diagram (left one in your image)
        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');

        root.left.left = new Node('D');
        root.left.right = new Node('E');
        root.right.left = new Node('F');
        root.right.right = new Node('G');

        root.left.left.left = new Node('H');
        root.left.left.right = new Node('I');
        root.left.right.left = new Node('J');
        root.right.left.left = new Node('L');
        root.right.left.right = new Node('M');

        root.left.left.left.left = new Node('P');
        root.left.left.left.right = new Node('Q');

        root.right.right.right = new Node('O');
        root.right.right.right.left = new Node('Y');
        root.right.right.right.right = new Node('Z');

        printSpiral(root);
    }
}
