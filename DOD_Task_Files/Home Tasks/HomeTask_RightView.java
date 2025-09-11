import java.util.*;

public class HomeTask_RightView {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Construct tree from list of strings (level-order)
    public void constructTreeFromList(List<String> inputData) {
        if (inputData.isEmpty() || inputData.get(0).equalsIgnoreCase("null")) {
            root = null;
            return;
        }

        root = new Node(Integer.parseInt(inputData.get(0)));
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < inputData.size()) {
            Node current = queue.poll();

            if (i < inputData.size() && !inputData.get(i).equalsIgnoreCase("null")) {
                current.left = new Node(Integer.parseInt(inputData.get(i)));
                queue.offer(current.left);
            }
            i++;

            if (i < inputData.size() && !inputData.get(i).equalsIgnoreCase("null")) {
                current.right = new Node(Integer.parseInt(inputData.get(i)));
                queue.offer(current.right);
            }
            i++;
        }
    }

    // Wrapper to print right view
    void rightView() {
        ArrayList<Integer> arr = new ArrayList<>();
        right(root, arr, 0);
        for (int e : arr)
            System.out.print(e + " ");
    }

    // Recursive helper for right view
    public static void right(Node root, ArrayList<Integer> arr, int lvl) {
        if (root == null)
            return;
        if (arr.size() == lvl) {
            arr.add(root.data);
        }
        right(root.right, arr, lvl + 1);
        right(root.left, arr, lvl + 1);
    }

    public static void main(String[] args) {
        HomeTask_RightView tree = new HomeTask_RightView();

        // Replace this with any level order input using "null" for missing nodes
        List<String> input = Arrays.asList(
                "1", "2", "3", "null", "5", "null", "4");

        tree.constructTreeFromList(input);

        System.out.println("Right view of binary tree:");
        tree.rightView(); // Output should be: 1 3 4
    }
}
