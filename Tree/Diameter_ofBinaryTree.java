package Tree;

//LeetCode - 543   O(n^2)
public class Diameter_ofBinaryTree {

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
	    public int diameterOfBinaryTree(TreeNode root) {
	    	if(root == null) {
	    		return 0;
	    	}
	    	
	        int left_diameter = diameterOfBinaryTree(root.left);
	        int right_diameter = diameterOfBinaryTree(root.right);
	        int diameter_passing_through_root = height(root.left)+height(root.right)+2;
	        
	        return Math.max(right_diameter, Math.max(left_diameter, diameter_passing_through_root));
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
