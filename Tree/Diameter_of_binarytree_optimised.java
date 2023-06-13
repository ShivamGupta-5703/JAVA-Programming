package Tree;

//LetCode - 543   O(n)
public class Diameter_of_binarytree_optimised{

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
	    	
	        return diameter(root).diameter;
	    }
	    class Diameter_height_pair{
	    	int diameter = 0;
	    	int height = -1;
	    }
	    
	    public Diameter_height_pair diameter(TreeNode root) {
	    	if(root == null) {
	    		return new Diameter_height_pair();
	    	}
	    	
	    	Diameter_height_pair left = diameter(root.left);
	    	Diameter_height_pair right = diameter(root.right);
	    	Diameter_height_pair dia_of_root = new Diameter_height_pair();
	    	
	    	int diameter_passing_through_root = left.height + right.height +2;
	    	
	    	dia_of_root.diameter = Math.max(diameter_passing_through_root,Math.max(left.diameter, right.diameter));
	    	dia_of_root.height = Math.max(left.height, right.height) + 1;
	    	
	    	return dia_of_root;
	    	
	    }
	}
}