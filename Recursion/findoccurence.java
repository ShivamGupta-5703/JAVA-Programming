package Recursion;

public class findoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,13,7,3,3,7,6,3};
		int item = 3;
		System.out.println(searchfirst(arr,0,item));
		System.out.println(searchlast(arr,arr.length-1,item));

	}
	//first occurence
	public static int searchfirst(int arr[] ,int i, int item ) {
		if(i == arr.length) {
			return -1;
		}
		
		if(arr[i] == item) {
			return i;
		}
		
		return searchfirst(arr,i+1,item);
	}
	//last occurence
	public static int searchlast(int arr[] ,int i, int item ) {
		if(i == -1) {
			return -1;
		}
		
		if(arr[i] == item) {
			return i;
		}
		
		return searchlast(arr,i-1,item);
	}

}
