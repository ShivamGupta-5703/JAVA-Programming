package Tree;
//LeetCode - 101

//Two types of qustions -->
// do tree ek doosre ke mirror h ya nhi
// ek tree symmtric mtlb left subtree is mirror image of right subtree.isme agar root node hata do toh 2 tree hi form ho jate same as  type 1.


public class Symmetric_Tree {
		
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
		public boolean isSymmetric(TreeNode root) {
		     return Symmetric(root.left,root.right);   
		}
		//Complexity - O(n)
		public boolean Symmetric(TreeNode root1,TreeNode root2) {
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
			
			boolean f1 = Symmetric(root1.left,root2.right);
			boolean f2 = Symmetric(root1.right,root2.left);
			
			return f1 & f2;   //agar dono true toh return true else false.
		}
	 }
}
