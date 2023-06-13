package Tree;

// LeetCode - 236
public class Lowest_Common_Ancestor_of_a_Binary_Tree {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}
	
	class Solution {
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        return CommonAncestor(root,p,q);
	    }
	    public TreeNode CommonAncestor(TreeNode root , TreeNode p,TreeNode q) {
	    	if(root == null) {
	    		return null;
	    	}
	    	
	    	//p ya q me jo mil jaye return kar do
	    	if(root==p || root ==q) {
	    		return root;
	    	}
	    	
	    	//Left and right me p and q doondho
	    	TreeNode left = CommonAncestor(root.left,p,q);
	    	TreeNode right = CommonAncestor(root.right,p,q);
	    	
	    	//jisme node pe dono mil jaye vo ancestor
	    	if(left != null && right != null) {
	    		return root;
	    	}
	    	else if(left == null) {
	    		return right;
	    	}else {
	    		return left;
	    	}
	    }
	}
}
