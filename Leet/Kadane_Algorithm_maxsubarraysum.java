package Leet;

public class Kadane_Algorithm_maxsubarraysum {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			int a[] = {5,-7,8,3};
			
			
			System.out.print(k(a));
			

		}
		public static int k(int a[]){
			int max=Integer.MIN_VALUE; //-2^31 
			int prev =0;
			// minimum value kyuki agar array me negative elements honge toh unke liye max=0 rhega always,but minimum sum me negative answer bhi aa skta h.
			for(int i=0;i<a.length;i++) {
				prev+=a[i];
				max = Math.max(max, prev);
				if(prev<0)
					prev=0;
				
			}
			return max ;
		}

	}


