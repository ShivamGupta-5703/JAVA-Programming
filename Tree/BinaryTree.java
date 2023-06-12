package Tree;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {

	public class Node{
		int val; 
		Node left;
		Node right;
	}
	
	Scanner sc = new Scanner(System.in);
	private Node root;
	
	public BinaryTree() {  //binary tree ka object banaya  
		root = CreateTree();
	}
	
	//Creating tree -->
	//[ Constructing is done using Pre-order Traversal ] -->
	private Node CreateTree() {    //createtree function call hua, jo tree banayega
		
		int item = sc.nextInt();  //data input liya
		Node nn = new Node();    //node banaya
		nn.val = item;     //node me value daali
		
		//pehle left node ke liye check hoga agar vo false then,right node ke liye check hoga.
		boolean hlc  = sc.nextBoolean();   //boolean value input lo,agar true h toh left me node banega,if false left me nhi jayenge bydefault null aayega.
		if(hlc) {
			nn.left = CreateTree();  //nn node ke left me tree create kar do
		}
		
		boolean hrc  = sc.nextBoolean();    //phir doosra boolean lo agar true toh right me tree bana do,if false right me nhi jayenge bydefault null aayega.
		if(hrc) {
			nn.right = CreateTree();
		}
		
		return nn;  ///last me node return kar do.
	}
	
	
	//Displaying tree -->
	
	//Client ko root node accessible nhi  h, agar hum neeche wale display ko public karde toh client ko node bhi dena padega.isliye humne usko private bana diya aur ek extra public method  display me call kar diya jisme node ki requirement nhi h 
	
	//this is method overriding.
	//this is also method hiding.
	
	public void Display() {
		Display(root);
	}
	
	private void Display(Node node) {
		//output will be of format --> left node value <-- node value --> right node value
		
		if(node==null)
			return;
		
		String s  = "";
		s = "<--" + node.val +"-->";
		
		//for left node 
		if(node.left!=null) {
			s = node.left.val +s;
		}else {
			s = "."+s;
		}
		
		//for right node 
		if(node.right!=null) {
			s = s+node.right.val;
		}else {
			s = s+".";
		}
		System.out.println(s);
		
		//then for left subtree
		Display(node.left);
		
		//then for right subtree
		Display(node.right);
		
	}
	
	//linear search of tree -->
	//Complexity --> O(n)  //har node ko ek baar visit kar rhe h , aur uss node pe constant kaam kar rhe h
	public boolean Find(int item) {
		return Find(this.root,item);
	}
	
	private boolean Find(Node nn,int item) {
		if(nn == null) {
			return false;
		}
		if(nn.val == item) {
			return true;
		}
		boolean left = Find(nn.left,item);
		if(left)return true;
		
		boolean right = Find(nn.right,item);
		if(right)return true;
		
		return left || right;
	}
	
	//Maximum in tree -->
	//Complexity --> O(n)
	public int Maximum() {
		return Maximum(this.root);
	}
	
	// left subtree ka maximum,right subtree ka maximum aur root node teeno ka maximum return kar dienge.
	private int Maximum(Node node) {
		if(node==null)
			return Integer.MIN_VALUE;   //agar node hi null hoga toh minimum value ko return kar deinge
		
		int left = Maximum(node.left);
		int right = Maximum(node.right);
		return Math.max(node.val, Math.max(left, right));
	}
	
	//Height of Tree -->
	public int Height() {
		return Height(this.root);
	}
	
	private int Height(Node node) {
		if(node==null)
			return -1;    //agar 0 return kiya toh vo single node ki height le lega kyuki return statement me humne 1 add kiya isliye -1 return kiya.
		
		int left = Height(node.left);
		int right = Height(node.right);
		
		return Math.max(left, right)+1;
	}
	
	
	//Tree Traversal -->
	
	//PreOrder --> O(n) [n call stacks]
	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();	
	}
	private void PreOrder(Node node) {
		if(node==null)
			return;
		
		System.out.print(node.val+" ");
		PreOrder(node.left);
		PreOrder(node.right);
	}
	
	//PostOrder --> O(n) [n call stacks]
	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();	
	}
	private void PostOrder(Node node) {
		if(node==null)
			return;
			
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val+" ");
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
	
	//LevelOrder --> O(n) [n call stacks]
	public void LevelOrder() {
		Queue<Node> q  =new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node rv = q.poll();
			System.out.print(rv.val+" ");
			if(rv.left!=null) {
				q.add(rv.left);
			}
			if(rv.right!=null) {
				q.add(rv.right);
			}
		}
		System.out.println();
	}
}
