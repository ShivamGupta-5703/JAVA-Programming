package Sorting;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,3,2,11,4};
		sort(arr,0,arr.length-1);
		display(arr);

	}
	public static void sort(int arr[],int start,int end) {
		if(start>=end) {
			return;
		}
		int idx = Partition(arr,start,end);
		sort(arr,start,idx-1);
		sort(arr,idx+1,end);
	}
	public static int Partition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int item = arr[ei];
		int idx = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] <= item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++; 
			}

		}
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx;

	}
	public static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
