package Tree;


//LeetCode -112
//like combination sum
public class Path_Sum {
	
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
	    public boolean hasPathSum(TreeNode root, int targetSum) {
	    	
	    	if(root == null) {
	    		return false;
	    	}
	    	
	    	if(root.left == null  && root.right == null) {
	    		return targetSum - root.val == 0;
	    	}
	    	
	    	//traverse left node and right node , until you find target sum,if either gives path return true.
	    	
	    	boolean left = hasPathSum(root.left,targetSum-root.val);
	    	boolean right = hasPathSum(root.right,targetSum-root.val);
	    	
	    	return left || right ;
	    }
	}
}
