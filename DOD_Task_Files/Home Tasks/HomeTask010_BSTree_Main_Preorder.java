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
public class HomeTask010_BSTree_Main_Preorder {
    TreeNode root;

    // Constructor
    public HomeTask010_BSTree_Main_Preorder() {
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
        } else {
            System.out.println("Duplicate value " + value + " not inserted.");
        }

        return node;
    }

    // Inorder traversal
    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

    // Preorder traversal
    public void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Main method
    public static void main(String[] args) {
        HomeTask010_BSTree_Main_Preorder bst = new HomeTask010_BSTree_Main_Preorder();

        // Insert elements
        int[] values = { 50, 30, 70, 20, 40, 60, 80, 6, 2, 6, 8 };
        for (int val : values) {
            bst.insert(val);
        }

        // Traversals
        System.out.print("\nInorder Traversal: ");
        bst.inorder(bst.root);

        System.out.print("\nPreorder Traversal: ");
        bst.preorder(bst.root);

        System.out.println();
    }
}
