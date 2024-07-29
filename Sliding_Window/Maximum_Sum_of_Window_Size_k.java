package SlidingWindow;

public class Maximum_Sum_of_Window_Size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,7,5,11,3,2,1};
		int k = 3;
		System.out.println(MaxSum(arr,k));
		
	}
	public static int MaxSum(int arr[] , int k) {
		
		int sum=0;
		
		//1st window
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		
		int ans = sum;
		
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];        //adding next element in window
			sum-=arr[i-k];     // removing first in window
			ans = Math.max(ans, sum);     //answer update
		}
		return ans;
	}

}
