// TreeNode class to represent each node
class TreeNode { // Represents a node in the binary search tree
    // Attributes of the node
    int value;
    TreeNode left, right;

    public TreeNode(int val) { // Constructor
        value = val; 
        left = right = null;
    }
}

// BinarySearchTree class with insert, delete operations
public class Task006_BSTree_Delete {
    TreeNode root;

    // Insert value into BST
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

    // Delete a node from the BST
    public void delete(int key) {
        root = deleteVal(root, key);
    }

    private TreeNode deleteVal(TreeNode node, int key) {
        if (node == null) return null;

        if (key < node.value) {
            node.left = deleteVal(node.left, key);
        } else if (key > node.value) {
            node.right = deleteVal(node.right, key);
        } else {
            // Case 1: Node with no child
            if (node.left == null && node.right == null) {
                return null;
            }
            // Case 2: One child
            else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            // Case 3: Two children
            else {
                int minVal = findMin(node.right);
                node.value = minVal;
                node.right = deleteVal(node.right, minVal);
            }
        }
        return node;
    }

    // Helper to find minimum value in a subtree
    private int findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.value;
    }

    // Inorder traversal
    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Task006_BSTree_Delete bst = new Task006_BSTree_Delete();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            bst.insert(val);
        }

        System.out.print("Inorder before deletion: ");
        bst.inorder(bst.root);
        System.out.println();

        // Delete a node
        bst.delete(70);  // try deleting a node with two children

        System.out.print("Inorder after deleting 70: ");
        bst.inorder(bst.root);
        System.out.println();
    }
}
