package Tree;

import java.util.*;

//Creating tree using level_order.
public class Level_Order_Traversal {

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
	TreeNode root;
	static Scanner sc = new Scanner(System.in);
	public Level_Order_Traversal() {
		root = buildtree();
	}
	public TreeNode buildtree() {
		int item = sc.nextInt();
		TreeNode node = new TreeNode();
		node.val = item;
		root=node;
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
			TreeNode rv = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if(c1!=-1) {
				TreeNode n = new TreeNode();
				n.val = c1;
				rv.left=n;
				q.add(n);
			}
			if(c2!=-1) {
				TreeNode n = new TreeNode();
				n.val = c2;
				rv.right=n;
				q.add(n);
			}
		}
		return root;
	}
	
	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}
	private void PostOrder(TreeNode node) {
		if(node==null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val+" ");
	}
	public static void main(String[] args) {
		Level_Order_Traversal h = new Level_Order_Traversal();
		h.PostOrder();
		//input = 10 20 30 40 -1 -1 50 -1 -1 60 -1 -1 -1. 
	}

}
