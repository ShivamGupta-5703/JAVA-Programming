public class Decimal_to_binary {

	public static void main(String[] args) {
		int n=4;
		int multiplier = 1;
		int sum=0;
		while(n>0) {
			int rem = n%2;
			sum = sum + rem*multiplier;
			multiplier = multiplier*10;
			n=n/2;
		}
		System.out.print(sum);

	}

}
