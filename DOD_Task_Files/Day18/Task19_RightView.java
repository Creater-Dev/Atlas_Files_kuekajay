import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Task19_RightView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        // If tree is empty
        if (root == null)
            return result;

        // Queue for BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // BFS traversal level by level
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode current = null;

            for (int i = 0; i < size; i++) {
                current = queue.poll();

                // Add left and right children
                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }

            // The last node in each level is the rightmost node
            if (current != null)
                result.add(current.val);
        }

        return result;
    }

    // Helper method to build a tree from array (for testing)
    public static TreeNode buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null)
            return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        Task19_RightView sol = new Task19_RightView();

        // Example input: [1,2,3,null,5,null,4]
        Integer[] input = { 1, 2, 3, null, 5, null, 4 };
        TreeNode root = buildTree(input);

        List<Integer> output = sol.rightSideView(root);
        System.out.println("Right side view: " + output);
    }
}
