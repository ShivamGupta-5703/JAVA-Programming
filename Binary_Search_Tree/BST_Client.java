package Binary_Search_Tree;

public class BST_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in[] = {10,20,30,40,50,60,70,80,90};
		BST bst = new BST(in);
		bst.InOrder();
		System.out.println(bst.Maximum());
		System.out.println(bst.Find(30));
	}

}
