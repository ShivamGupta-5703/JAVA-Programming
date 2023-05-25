package Array;

import java.util.Scanner;

public class DivisibleSubarray {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int  n = sc.nextInt();
		 int arr[] = new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i] = sc.nextInt();
		 }
		 System.out.println(GoodSubArray(arr));
		 

	}
	public static long GoodSubArray(int arr[]) {
		int n = arr.length;
		long freq[] = new long[n];
		int sum=0;
		freq[0] = 1;       
		//commulative sum wali array me hum N+1 size ki array lete the jisme first index pe empty subarray ka sum hota tha toh hum frequency table ,me occurence of zero +1 karenge starting me.
		
		for(int i=0;i<n;i++) {
			
			sum = sum + arr[i] ; 
			sum = sum%n;                   // int p = sum%n;
			
			if(sum<0) {
				sum += n;
			}
			
			freq[sum] = freq[sum]+1;       // freq[p] = freq[p] +1  //here, we are not using p becoz sum might go out of range of long . but if we modulo sum it will not go out of range.
		}
		long ans =0;
		for(int i=0;i<n;i++) {
			if(freq[i]>=2) {
				ans= ans + (freq[i]*(freq[i]-1))/2;
			}
		}
		return ans;
		
	}

}
