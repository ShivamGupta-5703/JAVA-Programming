package Tree;

//LeetCode - 1373

public class Maximum_Sum_Bst_in_BinaryTree {

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
		 public int maxSumBST(TreeNode root) {
			return validBst(root).ans;
		}

		public BSTPair validBst(TreeNode root) {
			if (root == null) {
				return new BSTPair();
			}

			BSTPair leftBstPair = validBst(root.left);
			BSTPair rightBstPair = validBst(root.right);
			BSTPair selfBstPair = new BSTPair();

			selfBstPair.minimum = Math.min(root.val, Math.min(leftBstPair.minimum, rightBstPair.minimum));
			selfBstPair.maximum = Math.max(root.val, Math.max(leftBstPair.maximum, rightBstPair.maximum));
			selfBstPair.isBst = leftBstPair.isBst && rightBstPair.isBst && root.val > leftBstPair.maximum
					&& root.val < rightBstPair.minimum;

			if (selfBstPair.isBst) {
				selfBstPair.ans = Math.max(selfBstPair.sum,Math.max(leftBstPair.ans, rightBstPair.ans));
			} else {
				selfBstPair.ans = Math.max(leftBstPair.ans, rightBstPair.ans);
			}

			return selfBstPair;

		}
	}

	class BSTPair {
		boolean isBst = true;
		long minimum = Long.MAX_VALUE;
		long maximum = Long.MIN_VALUE;
		int sum = 0;   // saare node ka sum
		int ans=0;     // bst part ka sum 

	}

}
