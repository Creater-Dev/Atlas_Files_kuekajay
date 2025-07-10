// TreeNode class to represent each node
class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int val) {
        value = val;
        left = right = null;
    }
}

// BinarySearchTree class with insert and search operations
public class Task006_BSTree_Search {
    TreeNode root;

    // Insert method
    public void insert(int value) {
        root = insertVal(root, value);
    }

    private TreeNode insertVal(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }

        if (value < node.value) {
            node.left = insertVal(node.left, value);
        } else {
            node.right = insertVal(node.right, value);
        }

        return node;
    }

    // Search method (Binary Search)
    public boolean search(int key) {
        return searchVal(root, key);
    }

    private boolean searchVal(TreeNode node, int key) {
        if (node == null) {
            return false;
        }

        if (key == node.value) {
            return true;
        } else if (key < node.value) {
            return searchVal(node.left, key);
        } else {
            return searchVal(node.right, key);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Task006_BSTree_Search bst = new Task006_BSTree_Search();

        // Insert values into the tree
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            bst.insert(val);
        }

        // Search test
        int key = 60;
        if (bst.search(key)) {
            System.out.println("Value " + key + " found in the tree.");
        } else {
            System.out.println("Value " + key + " not found in the tree.");
        }

        // Search another value
        key = 25;
        if (bst.search(key)) {
            System.out.println("Value " + key + " found in the tree.");
        } else {
            System.out.println("Value " + key + " not found in the tree.");
        }
    }
}
