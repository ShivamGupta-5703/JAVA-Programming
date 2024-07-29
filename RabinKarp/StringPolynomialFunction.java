// Pattern Matching -->

// for pattern matching in a string, we have 2 strings and we need to find if one string exist in other.
// SO we generate all sub arrays of 3 length and check this approach goes to O(N^2). 
// But we need to do it in O(N).

// ## Rabin Karp Algorithm ## -->

//1. Find unique hash code of string -->

// For example - string APPLE --
// HashCode is calculated as ->
// A * P^0 + P * P^1 + P * P^2 + L * P^3 + E * P^4 
// 1 * P^0 + 16 * P^1 + 16 * P^2 + 12 * P^3 + 5 * P^4   [ alphabet_number * P^(index) ]

// For P -->
// P has to be unique or we will get repeated hash code (not unique). SO will take P as prime number.
// Now P should be a prime number greater than 26. 
// Because , we get duplicate hash code
// for example - 
// for l = 12 * 11^0 = 12
// for aa = 1 * 11^0 + 1 * 11^1 = 12
// Both have same hash code, so we have to take prime number greater than 26.


package RabinKarp;

public class StringPolynomialFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "APPLE";
		System.out.println(hashCode(str));
	}
	public static long hashCode(String str) {
		long mod = 1000_000_007;
		long pow = 1;
		long p = 31;
		long hv = 0; // highest value
		for(int i = 0;i < str.length();i++) {
			int pos = str.charAt(i) - 'A' + 1;
			hv = (hv + (pos * pow) % mod) % mod;  // for a = 1 * 31^0
			pow = (pow * p) % mod;                // pow = 1 * 31 , now for p . pow is 31, and for next it will be 31 * 31, then after that 31 * 31 * 31.
		}
		return hv;
	}

}
