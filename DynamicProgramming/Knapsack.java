package DynamicProgramming;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] val = { 8, 4, 0, 5, 3 };
		int cap = 4;
		System.out.println(maximumvalue(wt, val, cap, 0));

	}

	public static int maximumvalue(int[] wt, int[] val, int cap, int i) {
		if (i == wt.length || cap == 0) {
			return 0;
		}
		int inc = 0;
		int exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + maximumvalue(wt, val, cap - wt[i], i + 1);
		}

		exc = maximumvalue(wt, val, cap, i + 1);
		return Math.max(inc, exc);

	}
	
//    static int knapSack(int W, int wt[], int val[], int n) 
//    { 
//         // your code here 
//        int dp[][] = new int[n + 1][W + 1];
//        for (int a[] : dp) Arrays.fill(a, 0);
//        return profit(W,wt,val,n-1,dp);
//
//    }
//    public static int profit(int cap, int wt[], int val[], int idx, int dp[][]) {
//        if (idx < 0 || cap == 0) return 0;
//        if (dp[idx][cap] != 0) return dp[idx][cap];
//        if (cap >= wt[idx]) dp[idx][cap] = Math.max(val[idx] + profit(cap - wt[idx], wt, val, idx - 1, dp), profit(cap, wt, val, idx - 1, dp));
//        else dp[idx][cap] = profit(cap, wt, val, idx - 1, dp);
//        return dp[idx][cap];
//    }

}