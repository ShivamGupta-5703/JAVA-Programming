package Recursion;

public class alloccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,13,7,3,3,7,6,3};
		int item = 3;
		searchall(arr,0,item);

	}
	public static void searchall(int arr[] ,int i, int item ) {
		if(i == arr.length) {
			return;
		}
		
		if(arr[i] == item) {
			System.out.println(i);
		}
		
		searchall(arr,i+1,item);
	}

}
