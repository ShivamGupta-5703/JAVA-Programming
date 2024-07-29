// We can do it in n^2 approach but it will give TLE because constraints are n = 10^5 which makes n^2 = 10^10. too much

// We need to do it in O(nlogn).
// The trick is to sort the given array as well as queries with respect to mi
// Then calculate maximum xor of number in array that are below mi, for ith iteration
// then calculate xor for sorted query in ith itertion, then adding elements in trie till ith index.
// In this way, we dont have to go through all elements again.
// We would have already calculated max xor for the elements in the trie, in each iteration.

// Saare mi sorted and given array bhi sorted, ab hum array me check karenge m1 se chota kaun, usse hum xor nikalenge, aur phir jitne elements ka xor nikal gya unko trie me daal deinge. Iss tareeke se sirf ke baar traverse krna padega. array which is O(N) and nlogn sorting ka. Total O(N LOGN).

package BitMasking;

import java.util.*;

public class MaximumXORWithanElementFromArray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[] = {5, 2, 4, 6, 6, 3};
			Arrays.sort(arr);
			int queries[][] = {{12, 4}, {8, 1}, {6, 3}};
			Pair p[] = new Pair[queries.length];
			for(int i = 0;i < p.length;i++) {
				p[i] = new Pair(queries[i][0] , queries[i][1], i);
			}
			Arrays.sort(p, new Comparator<Pair>() {
				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					return o1.mi - o2.mi;
				}
			});
			
			int ans[] = new int[p.length];
			int j = 0;
			Node root = new Node();
			for(Pair x : p) {
				while(j < arr.length && arr[j] <= x.mi) {
					Insert(root, arr[j]);
					j++;
				}
				if(j == 0) {
					ans[x.i] = -1;
				}else {
					ans[x.i] = findMaximumXOR(root, x.xi);
				}
			}
			
			
		}
		public static class Pair{
			int xi, mi, i;
			public Pair(int xi, int mi, int i) {
				this.xi = xi;
				this.mi = mi;
				this.i = i; //index
			}
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
