package Tree;

//LeetCode - 110  || O(n^2)

public class Balanced_BinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	 }
	class Solution {
	    public boolean isBalanced(TreeNode root) {
	        return Balanced(root);
	    }
	    
	    public boolean Balanced(TreeNode root) {
	        
	    	if(root==null) {
	    		return true;
	    	}
	    	
	    	boolean left = Balanced(root.left);
	    	boolean right = Balanced(root.right);
	    	boolean height_difference  = Math.abs(height(root.left)) <= 1;
	    	return left && right && height_difference;
	    }
	    public int height(TreeNode root) {
	    	if(root==null) {
	    		return -1;
	    	}
	    	int leftheight = height(root.left);
	    	int rightheight = height(root.right);
	    	return Math.max(leftheight, rightheight)+1;
	    }
	}
	
}
