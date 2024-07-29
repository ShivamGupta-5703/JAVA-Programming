// Find a number X such that (X XOR A) is minimum and the number of set bits in X and B are equal.
// Example. - X = 3, A = 3, B = 5.

// 1. First count set bits in b.
// 2. Then to make x, put 1 where there is 1 in a from MSB.
// 3. If Count set remains, start from LSB and put 1 where there is zero in x.

package BitMasking;

public class SetBitEqualXB_MinimumXA {
	public static void main(String[] args) {
		int a = 11;
		int b = 18;
		System.out.print(Minval(a, b));
	}
	public static int CountSet(int b) {
		int count = 0;
		while(b > 0) {
			 count++;
			 b = (b & (b - 1));
		}
		return count;
	}
	public static int Minval(int a, int b) {
		int countSet = CountSet(b);
		int x = 0;
		for(int i = 31;i >= 0 && countSet > 0;i--) {
			if((a & (1 << i)) != 0) {
				x += (1 << i);
				countSet --;
			}
		}
		for(int i = 0;i <= 31 && countSet > 0;i++) {
			if((a & (1 << i)) == 0) {  // shift 1, i times
				x += (1 << i);
				countSet--;
			}
		}
		return x;
	}
}
