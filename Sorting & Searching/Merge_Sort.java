package Sorting;
public class Merge_Sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,1,3,4,2};
		int ans[] = Sort(arr,0,arr.length-1);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] Sort(int arr[],int start,int end) {
		if(start==end) {  //agar ek hi element h\
			int base[] = new int[1];
			base[0] = arr[start];
			return base;
		}
		int mid = (start+end)/2;
		int fs[] = Sort(arr,start,mid);
		int ss[] = Sort(arr,mid+1,end);
		return combine(fs,ss);
	}
	public static int[] combine(int arr1[],int arr2[]) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0;// arr1
		int j = 0;// arr2
		int k = 0;// ans
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = arr1[i];
			k++;
			i++;
		}
		while (j < m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}
}
