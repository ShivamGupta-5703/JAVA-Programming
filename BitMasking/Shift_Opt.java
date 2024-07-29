package BitMasking;

public class Shift_Opt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(n >> 1);
		int a = -11;
		System.out.println(a >> 1);

		int b = 15;
		System.out.println(b << 1);
	}
}



// Last Bit drop hone ke baad cycle repeat hoga from 1.
// Left shift - MSB drop krte h, baaki har bit ek ek shift aage , then last me laga do
// a << b = a * 2^b || Not always true, jab bit MSB me pahuch jayega then it is negative number. Ek baar aur left shift krne ke baad MSB drop hogi
// then number zero hoga, toh system hume last me 1 add karke bhej dega and phirse cycle shuru hogi. 
// Jis number ko left shift kiya cycle wahi se shuru higa,
