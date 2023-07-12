package Leet;

public class Product_of_array_except_itself {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int [] answer = product( nums);
		for(int i =0;i<nums.length;i++) {
			System.out.print(answer[i]+" ");
		}

	}
	public static int[] product(int nums[]) {
		int n = nums.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] =1;
		for(int i=1;i<n;i++) {
			left[i]=nums[i-1]*left[i-1];
		}
		right[n-1] =1;
		for(int i=n-2;i>=0;i--) {
			right[i]= nums[i+1]*right[i+1];
		}
		for(int i=0;i<n;i++) {
			nums[i] = left[i]*right[i];
		}
		return nums;
	}

}
