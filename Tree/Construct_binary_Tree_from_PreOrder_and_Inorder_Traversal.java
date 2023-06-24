package Tree;

// LeetCode - 105 
public class Construct_binary_Tree_from_PreOrder_and_Inorder_Traversal {

	
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
	    public TreeNode buildTree(int[] preorder, int[] inorder) {
	        return CreateTree(preorder,inorder,0,inorder.length-1,0,preorder.length-1);
	    }
	    
	    public TreeNode CreateTree(int pre[],int in[],int inlo,int inhi,int prelo,int prehi) {
	    	if(inlo > inhi || prelo>prehi) {
	    		return null;
	    	}
	    	
	    	
	    	//craete a tree with root as first element of preorder.
	    	TreeNode node =  new TreeNode(pre[prelo]);
	    	//find index of root in inorder , to find left and right subtree.
	    	int index = search(in,inlo,inhi,pre[prelo]);
	    	
	    	// to find elements of left subtree
	    	int net = index - inlo;
	    	
	    	//create left and right subtree
	    	node.left = CreateTree(pre,in,inlo,index-1,prelo+1,prelo+net);
	    	node.right = CreateTree(pre,in,index+1,inhi,prelo+net+1,prehi);
	    	return node;
	    	
	    	
	    }
	    public int search(int arr[],int start,int end,int item) {
	    	for(int i= start;i<=end;i++) {
	    		if(arr[i] == item)return i;
	    	}
	    	return 0;
	    }
	}
	
}
