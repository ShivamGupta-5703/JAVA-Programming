//A magic number is defined as a number that can be expressed as a power of 5 or sum of unique powers of 5. 
//First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
//Given the value of n, find the n'th Magic number modulo 109+7.


package BitMasking;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(Nthmagicnumber(n));

	}

	public static int Nthmagicnumber(int n) {
		int ans = 0;
		int mul = 5;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans = ans + mul;
			}
			mul = mul * 5;
			n = n >> 1;
		}
		return ans;
	}
}