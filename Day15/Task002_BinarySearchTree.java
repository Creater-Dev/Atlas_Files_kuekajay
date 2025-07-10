// Create a class named Binarty Search tree in which you have 2 insert operations

// 	1 insert —----> for inserting if the tree is empty
// 	1 insert —----> for inserting if the tree is 1 or more nodes

// TreeNode class to represent each node
class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int val) {
        value = val;
        left = right = null;
    }
}

public class Task002_BinarySearchTree {
    TreeNode root;

    // Constructor
    public Task002_BinarySearchTree() {
        root = null;
    }

    // Insert method for empty tree
    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
            System.out.println("Inserted " + value + " as root node.");
        } else {
            insert(root, value);  // If root is not null, use insert method for further nodes
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

}
