package Leet;

import java.util.*;

public class LC_498_Diagonal_Traversal {

	public int[] findDiagonalOrder(int[][] mat) {
		int n = mat.length; // rows
		int m = mat[0].length; // columns
		// int diagonals = n+m-1; // number of diagonals
		int i=0;

		int ans[] = new int[n * m];
		
		for (int d = 0; d < n + m - 1; d++) {
			int r = 0;
			int c = 0;
			
			if(d<m) {
				r=0;
				c=d;
			}
			else {
				c=m-1;
				r=d-m+1;
			}
			ArrayList<Integer> list = new ArrayList<Integer>(); // Since elements in each diagonal is not different.
			//contains elements of only one diagonal.
			
			
			while(r<n && c>=0) {
				list.add(mat[r][c]);
				r++;
				c--;
			}
			if(d%2==0) {
				Collections.reverse(list);
			}
			
			for(int val: list) {
				ans[i] = val;
				i++;
			}
		}
			
		return ans;
	}
}


