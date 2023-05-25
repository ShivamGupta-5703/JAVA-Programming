package Array;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int k=3;
		rotatearray(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}
	//brute force
	public static void rotatearray(int[] arr,int k) {
		int n = arr.length;
		k=k%n;          //for large values of k , we mod by n.
		for(int j=1;j<=k;j++) {
			int last_element = arr[n-1];
			for(int i=n-2;i>=0;i--) {
				arr[i+1]=arr[i];
			}
			arr[0] = last_element;
		}
		
	}
	//reversal algo
	public void rotate(int[] nums, int k) {
        int n = nums.length;
		k=k%n;          //for large values of k , we mod by n.
		Reverse(nums,0,n-k-1); // 0 to n-k-1 elements
		Reverse(nums,n-k,n-1); //n-k elements to end
		Reverse(nums,0,n-1);   //whole array
    }
    public static void Reverse(int arr[] , int i,int j){
        while(i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
                i++;
                j--;
			}
    }

}
