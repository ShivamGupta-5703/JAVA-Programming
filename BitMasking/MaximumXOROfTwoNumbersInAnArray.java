// Given an integer array nums, return the maximum result of nums[i] XOR nums[j], where 0 <= i <= j < n.

// 1. for such questions with arrays or range we use trie.
// 2. Make a hook *
// 3. Write numbers in binary form and make a tree like trie. [trie of binary]
// 4. Number are 32 bits and there are n numbers so complexity = []32*n]
// 5. Trie me 2 child ho skte h either 0 or 1.
// 6. So we dont track data.
// 7. For maximum XOR, take one number from array. Convert it to binary. Now if bit of binary of number is 0, we got branch in treee jiska child 1 ho for maximum XOR.
// 8. Agar no option, toh jo child hoga uske saath continue karenge. 
// 9. Har element ka XOR karenge jiska maximum ukso return deinge.



package BitMasking;
public class MaximumXOROfTwoNumbersInAnArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,10,5,25,2,8};
		Node root = new Node();
		for(int val : nums) {
			Insert(root, val);
		}
		int ans  = Integer.MIN_VALUE;
		for(int val : nums) {
			ans = Math.max(ans, findMaximumXOR(root, val));
		}
		System.out.println(ans);
	}
	
	// Making Binary Tree
	public static class Node{
		Node zero;
		Node one;
	}
	public static void Insert(Node root, int val) {
		Node current = root;
		for(int i = 31;i >= 0;i--) {
			int bit = (val & (1 << i));
			if( bit == 0) {
				if(current.zero != null) {
					current = current.zero;
				}else {
					Node nn = new Node();
					current.zero = nn;
					current = nn;
				}
			}else {
				if(current.one != null) {
					current = current.one;
				}else {
					Node nn = new Node();
					current.one = nn;
					current = nn;
				}
			}
		}
	}
	
	// find maximum
    public static int findMaximumXOR(Node root,int val) {
    	Node curr = root;
		int xor = 0;
		for (int i = 31; i >= 0; i--) {
			int bit = (val & (1 << i));
			if (bit == 0) {
				if (curr.one != null) {
					xor += (1 << i);
					curr = curr.one;
				} else {
					curr = curr.zero;
				}
			} else {
				if (curr.zero != null) {
					xor += (1 << i);
					curr = curr.zero;
				} else {
					curr = curr.one;
				}
			}
		}
		return xor;
    }

}

