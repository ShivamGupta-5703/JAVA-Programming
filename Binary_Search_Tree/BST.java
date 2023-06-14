package Binary_Search_Tree;

import Tree.BinaryTree.Node;

public class BST {

	public class Node{
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public BST(int in[]) {
		root = CreateTree(in,0,in.length-1);
	}
	
	public Node CreateTree(int in[],int start,int end) {
		if(start>end) {
			return null;
		}
		
		int mid = (start+end)/2;
		Node nn = new Node();
		nn.val = in[mid];
		nn.left = CreateTree(in,start,mid-1);
		nn.right = CreateTree(in,mid+1,end);
		return nn;
	}
	
	//InOrder --> O(n) [n call stacks]
		public void InOrder() {
			InOrder(this.root);
			System.out.println();	
		}
		private void InOrder(Node node) {
			if(node==null)
				return;
						
			InOrder(node.left);
			System.out.print(node.val+" ");
			InOrder(node.right);
		}
		
		
		//MAXIMUM IN BST.
		public int Maximum() {
			return Maximum(this.root);
		}
		
		private int Maximum(Node node) {
			if(node==null)
				return Integer.MIN_VALUE;   //agar node hi null hoga toh minimum value ko return kar deinge
			
			int right = Maximum(node.right);
			return Math.max(node.val,right);
		}
		
		
		//SEARCHING -->
		public boolean Find(int item) {
			return Find(this.root,item);
		}
		
		private boolean Find(Node nn,int item) {
			if(nn == null) {
				return false;
			}
			if(nn.val == item) {
				return true;
			}else if(nn.val>item) {
				return Find(nn.left,item);
			}else {
				return Find(nn.right,item);
			}
			
		}

}
