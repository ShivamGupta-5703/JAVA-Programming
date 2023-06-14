package Binary_Search_Tree;
//LeetCode - 701

public class Insert_Node_in_a_BST {

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
	    public TreeNode insertIntoBST(TreeNode root, int val) {
	        return insert(root,val);
	    }
	    public TreeNode insert(TreeNode root,int val) {
	    	if(root==null) {
	    		return new TreeNode(val);
	    	}
	    	
	    	if(root.val < val) {
	    		root.right = insert(root.right,val);
	    	}else {
	    		root.left = insert(root.left,val);
	    	}
	    	return root;
	    }
	}
}
