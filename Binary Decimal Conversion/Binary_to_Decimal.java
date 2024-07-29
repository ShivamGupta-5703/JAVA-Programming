public class Binary_to_Decimal {

	public static void main(String[] args) {
		int n=11;
		int multiplier = 1;
		int sum=0;
		while(n>0) {
			int rem = n%2;
			sum = sum + rem*multiplier;
			multiplier = multiplier*2;
			n=n/10;
		}
		System.out.print(sum);


	}

}
