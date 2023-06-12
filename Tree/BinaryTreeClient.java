package Tree;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.Display();
		
		System.out.println(bt.Find(70));
		System.out.println(bt.Maximum());
		System.out.println(bt.Height());
		
		bt.PreOrder();
		bt.PostOrder();
		bt.InOrder();
		bt.LevelOrder();
		
	}
}

//Input --> 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false