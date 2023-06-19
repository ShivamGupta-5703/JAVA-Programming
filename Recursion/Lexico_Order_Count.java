package Recursion;

public class Lexico_Order_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		lexicorder(0, n);

	}

	public static void lexicorder(int current, int end) {

		if(current>end) {
			return;
		}
		
		System.out.println(current);
		
		int i = 0;   
		
		if(current == 0) {
			i=1;       
		}
		//agar start zero nhi h toh 10 times loop chalega Ex. 190 to 199[total count 10]
		//agar start 0 h, then 9 times loop chalega Ex.  1 to 9 [9 recursive calls]
		
		for (; i <= 9; i++) {
			
			lexicorder(current * 10 +i,end);
		}
	}
}

