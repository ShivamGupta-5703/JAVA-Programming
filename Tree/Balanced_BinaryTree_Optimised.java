package Tree;

public class Balanced_BinaryTree_Optimised {

//LeetCode - 110  || O(n)

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
	        return Balanced(root).isBalanced;
	    }
	    
	    public Balanced_pair Balanced(TreeNode root) {
	    	if(root==null) {
	    		return new Balanced_pair();
	    	}
	    	
	    	Balanced_pair left = Balanced(root.left);
	    	Balanced_pair right = Balanced(root.right);
	    	Balanced_pair root_check = new Balanced_pair();
	    	
	    	root_check.height = Math.max(left.height,right.height) +1;
	    	boolean height_difference  = Math.abs(left.height - right.height) <= 1;
	    	root_check.isBalanced = left.isBalanced && right.isBalanced && height_difference ;
	    	
	    	return root_check;
	    }
	    class Balanced_pair{
	    	boolean isBalanced = true;
	    	int height = -1;
	    }
	}
	
}
