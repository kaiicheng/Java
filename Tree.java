import java.util.ArrayList;
import java.util.List;

public class Tree {

	public static class TreeNode {
		  private int value;
		  private List<TreeNode> children;

		  public TreeNode(int value) {
		    this.value = value;
		    this.children = new ArrayList<>();
		  }

		  public void addChild(TreeNode child) {
		    children.add(child);
		  }

		  public int getValue() {
		    return value;
		  }

		  public List<TreeNode> getChildren() {
		    return children;
		  }
	}
	
	public static void printTree(TreeNode node) {
		  System.out.println(node.getValue());
		  for (TreeNode child : node.getChildren()) {
			  printTree(child);
		  }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.addChild(new TreeNode(2));
		root.addChild(new TreeNode(3));
		root.addChild(new TreeNode(4));
		
//		System.out.println(root.getValue());
		
		System.out.println(root);
		
		printTree(root);
	}

}
