package Leet;

import java.util.*;

public class LC_713_Subarray_Product_Less_than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,2,3};
		int k=10;
		System.out.println(countnofSubarray(arr,k));

	}
	public static int countnofSubarray(int arr[],int k) {
		
		int si =0;
		int ei=0;
		int ans = 0;
		int product = 1;
		while(ei<arr.length) {
			
			// window grow
			product = product *arr[ei];
			
			
			//window shrink
			while(product>=k  && si<=ei) {
				product = product / arr[si];
				si++;
			}
			
			
			//calculate answer
			ans = ans +  (ei -si +1);   //answer + window size;
			ei++;
					
					
		}
		return ans;
		
	}

}

// hum pehle starting index leinge, then ending index, then answer jisme number of
//possible subarrays honge and product jisse hum calculate karenge product .
//ab ye 1 isliye h kyuki question me product pucha h aur agar hum 0 lete toh sab kuch 0 ho jata.
//
//Isme hum variable size of sliding window leinge because size of each subarray is not fixed. [koi 1 length ki hogi,koi 2 and so on.]
//Next hum loop start karenge till we reach last element of  given array.
//
//Window grow -
//ek ek karke elements ko product me multiply karenge till product is less than k [target].here humari window ka size increase karega for every element multiplied.
//
//window shrink -
//Now if product is greater than or equal to k . we have to remove first element and check again by increasing the starting index.
//jab humara product zyada hoga mtlb vo subarray suitable nhi h toh hum next subarray pe jayenge. and so on 
//
//answer -
//Now answer, we are adding (ei -si+1) means size of our current sliding window. 
//Agar subarray h [2] isme si = ei ,so ei-si+1 = 1 = number of subarray satisfying Condition.
//Agar subarray h [2,3] isme si =0, ei = 1 so ei-si+1 = 2 = number of subarray satisfying this consition [3] and [2,3] .isme [2] pehle step hi count ho chuka h
//ussi ke baad humne aur elements add akre h.



