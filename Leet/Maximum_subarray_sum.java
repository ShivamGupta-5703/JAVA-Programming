package Leet;

public class Maximum_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,-7,8,3};
		
		
		System.out.print(k(a));
		

	}
	public static int k(int a[]){
		int max=Integer.MIN_VALUE; //-2^31 
		// minimum value kyuki agar array me negative elements honge toh unke liye max=0 rhega always,but minimum sum me negative answer bhi aa skta h.
		for(int i=0;i<a.length;i++) {
			int prev=0;
			for(int j=i;j<a.length;j++) {
				prev+=a[j];
				max = Math.max(max, prev);
			}
		}
		return max ;
	}
	

}
