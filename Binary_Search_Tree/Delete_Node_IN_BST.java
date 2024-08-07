<<<<<<< HEAD
package Binary_Search_Tree;

// LeetCode - 450

public class Delete_Node_IN_BST {

	
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
	    public TreeNode deleteNode(TreeNode root, int key) {
	        return delete(root,key);
	    }
	    public TreeNode delete(TreeNode root,int key) {
	    	if(root==null) {
	    		return null;
	    	}
	    	
	    	if(root.val<key) {
	    		root.right = delete(root.right,key);
	    	}else if(root.val>key) {
	    		root.left = delete(root.left,key);
	    	}else {
	    		//Single node || 1 child   && Leaf Node
	    		if(root.left == null) {
	    			return root.right;
	    		}else if(root.right==null) {
	    			return root.left;
	    		}
	    		//2 child
	    		else {
	    			int max = Maximum(root.left);
	    			root.left = delete(root.left,max);
	    			root.val=max;
	    		}
	    	}
	    	return root;
	    }
	    private int Maximum(TreeNode node) {
			if(node==null)
				return Integer.MIN_VALUE;   //agar node hi null hoga toh minimum value ko return kar deinge
			
			int right = Maximum(node.right);
			return Math.max(node.val,right);
		}
	}
}
=======
package Binary_Search_Tree;

// LeetCode - 450

public class Delete_Node_IN_BST {

	
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
	    public TreeNode deleteNode(TreeNode root, int key) {
	        return delete(root,key);
	    }
	    public TreeNode delete(TreeNode root,int key) {
	    	if(root==null) {
	    		return null;
	    	}
	    	
	    	if(root.val<key) {
	    		root.right = delete(root.right,key);
	    	}else if(root.val>key) {
	    		root.left = delete(root.left,key);
	    	}else {
	    		//Single node || 1 child   && Leaf Node
	    		if(root.left == null) {
	    			return root.right;
	    		}else if(root.right==null) {
	    			return root.left;
	    		}
	    		//2 child
	    		else {
	    			int max = Maximum(root.left);
	    			root.left = delete(root.left,max);
	    			root.val=max;
	    		}
	    	}
	    	return root;
	    }
	    private int Maximum(TreeNode node) {
			if(node==null)
				return Integer.MIN_VALUE;   //agar node hi null hoga toh minimum value ko return kar deinge
			
			int right = Maximum(node.right);
			return Math.max(node.val,right);
		}
	}
}
>>>>>>> 9265cfa644a9e9f746adec26738ce8d105dde8ba
