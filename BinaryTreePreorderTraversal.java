
public class BinaryTreePreorderTraversal {
	
	public static class TreeNode {
    	public int value;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int value) {
            this.value = value;
        }
    }
    
    public static class Tree {
        private TreeNode root;
    }
    
    public static void preOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.println(root.value);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
	
	public static void main(String[] args) {
		
	    // create an object of BinaryTree
	    Tree tree = new Tree();
	    
	    // memory space
//	    System.out.println(tree);  // BinaryTreeInitialization2$Tree@4517d9a3

	    // create nodes of the tree
	    tree.root = new TreeNode(1);

	    tree.root.left = new TreeNode(2);
	    tree.root.right = new TreeNode(3);
	    tree.root.left.left = new TreeNode(4);
	    tree.root.left.right = new TreeNode(5);
	    tree.root.right.left = new TreeNode(6);
	    tree.root.right.right = new TreeNode(7);
	    
	    preOrderTraversal(tree.root);
	}
}
