package Tree;

//LeetCode - 98  || O(n)
public class Validate_Binary_Search_Tree {

	
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
	    public boolean isValidBST(TreeNode root) {
	    	return validBst(root).isBst; 
	    }
	    public BSTPair validBst(TreeNode root) {
	    	if(root==null) {
	    		return new BSTPair();
	    	}
	    	
	    	BSTPair leftBstPair  = validBst(root.left); 
	    	BSTPair rightBstPair  = validBst(root.right);
	    	BSTPair selfBstPair = new BSTPair();
	    	
	    	selfBstPair.minimum = Math.min(root.val, Math.min(leftBstPair.minimum, rightBstPair.minimum));
	    	selfBstPair.maximum = Math.max(root.val, Math.max(leftBstPair.maximum, rightBstPair.maximum));
	    	selfBstPair.isBst = leftBstPair.isBst && rightBstPair.isBst && root.val > leftBstPair.maximum && root.val < rightBstPair.minimum;
	    	
	    	return selfBstPair;
 	    	
	    }
	}
	class BSTPair{
		boolean isBst = true;
		long minimum = Long.MAX_VALUE;
		long maximum = Long.MIN_VALUE;
		
		
		
	}
}
