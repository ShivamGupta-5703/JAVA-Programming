package Tree;

import java.util.*;


public class Binary_Tree_Right_SideView {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	class Solution {
		//visit ek bhi nhi starting me isliye -1;
		
		int visited = -1;   //class ka data member can be directly accessed in class solution.
	    public List<Integer> rightSideView(TreeNode root) {
	    	
	    	List<Integer> ll = new ArrayList<>();
	    	// starting level 0 h is liye level me 0 pass kiya.
	    	view(root,0,ll);    // root, current level,list to add numbers.
	    	
	    	return ll;
	    }
	    public void view(TreeNode root,int current,List<Integer> ll) {
	    	if(root==null) {
	    		return;
	    	}
	    	if(current > visited) {
	    		ll.add(root.val);
	    		visited = current;
	    	}
	    	//pehle right ka call phir left ka call.
	    	view(root.right,current+1,ll);
	    	view(root.left,current+1,ll);
	    }
	}
}
