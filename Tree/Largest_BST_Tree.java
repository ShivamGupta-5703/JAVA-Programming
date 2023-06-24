package Tree;

//LeetCode - 333  || O(n)

public class Largest_BST_Tree {

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
		public int largestBSTSubtree(TreeNode root) {
			return validBst(root).size;
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
				selfBstPair.size = leftBstPair.size + rightBstPair.size + 1;
			} else {
				selfBstPair.size = Math.max(leftBstPair.size, rightBstPair.size);
			}

			return selfBstPair;

		}
	}

	class BSTPair {
		boolean isBst = true;
		long minimum = Long.MAX_VALUE;
		long maximum = Long.MIN_VALUE;
		int size = 0;

	}

}
