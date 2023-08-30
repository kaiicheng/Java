//	// Definition for a binary tree node.
//	public static class TreeNode {
//		int val;
//		TreeNode left;
//		TreeNode right;
//		TreeNode() {}
//		TreeNode(int val) { this.val = val; }
//		TreeNode(int val, TreeNode left, TreeNode right) {
//			this.val = val;
//			this.left = left;
//			this.right = right;
//		}
//	}

public class BinaryTreeInitialization {

	public static class Node {
		
		  int val;
		  Node left, right;

		  public Node(int item) {
			  val = item;
			  left = right = null;
		  }
	}
	
	// class to create nodes
	public static class Tree {
	  
		Node root;

		// Traverse tree
		public void traverseTree(Node node) {
		    if (node != null) {
		      traverseTree(node.left);
		      System.out.print(" " + node.val);
		      traverseTree(node.right);
		    }
		}
	}
		
	public static void main(String[] args) {
		
	    // create an object of BinaryTree
	    Tree tree = new Tree();

	    // create nodes of the tree
	    tree.root = new Node(1);
	    tree.root.left = new Node(2);
	    tree.root.right = new Node(3);
	    tree.root.left.left = new Node(4);

	    System.out.print("Binary Tree:");
	    tree.traverseTree(tree.root);
		
	}
}