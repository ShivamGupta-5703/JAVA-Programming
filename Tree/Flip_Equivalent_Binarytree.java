package Tree;
//LeetCode - 951


public class Flip_Equivalent_Binarytree {
	
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
	    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
	        return Equi(root1,root2);
	    	
	    }
	    public boolean Equi(TreeNode root1, TreeNode root2) {
	    	//Base Case 1 -->
			if(root1 == null  && root2 == null) {
				return true;
			}
			//Base Case 2 -->
			if(root1 == null  || root2 == null) {
				return false;
			}
			//Base Case 3 -->
			if(root1.val != root2.val) {
				return false;
			}
			//mirroring -->
			boolean flip = Equi(root1.left,root2.right) && Equi(root1.right,root2.left);
			//structuring {exactly same}
			boolean noflip = Equi(root1.left,root2.left) && Equi(root1.right,root2.right);
			
			return flip || noflip;   //kese bhi same tree banana h bas.chahe mirroring se chahe structuring se.
	    }
	}
	
}
