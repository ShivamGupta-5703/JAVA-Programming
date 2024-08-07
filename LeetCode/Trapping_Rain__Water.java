package LeetCode;

public class Trapping_Rain__Water {

	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		int n = rainwatertrapped(arr);
		System.out.println(n);
		
		
	}
	public static int rainwatertrapped(int[] arr) {
		int[] left = new int[arr.length];
		left[0]=arr[0];
		for(int i=1;i<arr.length-1;i++) {
			left[i] =Math.max(left[i-1], arr[i]);
		}
		
		int[] right = new int[arr.length];
		right[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			right[i] =Math.max(right[i+1], arr[i]);
		}
		int sum=0;
		for(int i=0;i<arr.length-1;i++) {
			int k = Math.min(left[i], right[i])-arr[i];
			sum+=k;
		}
		return sum;
		
	}

}
