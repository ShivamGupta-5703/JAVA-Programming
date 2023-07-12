
public class TypeCasting {

	public static void main(String[] args) {
		byte b  = 14;
		System.out.println(b);
		int i=300;
		b=(byte)i;   //type casting to byte
		b++; // b = (byte)(b+1)
		System.out.println(b);
		
		
		
		int ii=178;
		byte b1=62;
		ii=b1;
		System.out.println(ii);
		
		char ch='A';
		System.out.println(ch);
		System.out.println((int)ch);
		ch =(char)(ch+1);
		System.out.println(ch);
		ch++;   // ch = (char)(ch+1);
		System.out.println(ch);
		
		
		long ll = 24353543543l;  // use l,L at last
		System.out.println(ll);
		float f = 3.35434f;  // use f,F  at last
		System.out.println(f);
		double d =67.876 ;
		System.out.println(d);
		
		
		boolean bg = true;
		System.out.println(bg);
		boolean bf = false;
		System.out.println(bf);
		
		
		
		
		
	}

}
