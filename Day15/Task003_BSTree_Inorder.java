// TreeNode class to represent each node
class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int val) {
        value = val;
        left = right = null;
    }
}

// BinarySearchTree class
public class Task003_BSTree_Inorder {
    TreeNode root;

    // Constructor
    public Task003_BSTree_Inorder() {
        root = null;
    }

    // Insert method for empty tree
    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
            System.out.println("Inserted " + value + " as root node.");
        } else {
            insert(root, value); // If root is not null, use insert method for further nodes
        }
    }

    // Insert method for tree with one or more nodes
    public TreeNode insert(TreeNode node, int value) {
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    // Inorder traversal for testing
    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

}
