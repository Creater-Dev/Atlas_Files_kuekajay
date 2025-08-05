import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class HomeTask_AltLevelReverseAndPrint {

    // Collect nodes at each level
    private static void collectLevels(Node root, List<List<Node>> levels, int level) {
        if (root == null)
            return;
        if (levels.size() == level)
            levels.add(new ArrayList<>());
        levels.get(level).add(root);
        collectLevels(root.left, levels, level + 1);
        collectLevels(root.right, levels, level + 1);
    }

    // Reverse node values at odd-indexed levels
    public static void reverseAlternateLevels(Node root) {
        List<List<Node>> levels = new ArrayList<>();
        collectLevels(root, levels, 0);
        for (int i = 1; i < levels.size(); i += 2) {
            List<Node> level = levels.get(i);
            int left = 0, right = level.size() - 1;
            while (left < right) {
                int temp = level.get(left).data;
                level.get(left).data = level.get(right).data;
                level.get(right).data = temp;
                left++;
                right--;
            }
        }
    }

    // Print level order traversal in a single line
    public static void printLevelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null)
                queue.add(curr.left);
            if (curr.right != null)
                queue.add(curr.right);

            // for (int i = 0; i < size; i++) {
            // Node curr = queue.poll();
            // System.out.print(curr.data + " ");
            // if (curr.left != null)
            // queue.add(curr.left);
            // if (curr.right != null)
            // queue.add(curr.right);
            // }
            // System.out.println();
        }
    }

    public static void main(String[] args) {
        // Build test tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);

        reverseAlternateLevels(root);
        printLevelOrder(root);
    }
}
