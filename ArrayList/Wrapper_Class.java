package ArrayList;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a =100;
		int a1 =10;
		Short s = 78;
		Byte b = 18;
		
		System.out.println(a);
		System.out.println(a1);
		System.out.println(b);
		System.out.println(s);
		
		a=a1;     // integer autoboxing
		System.out.println(a);
		
		Integer ii =100;
		int i=10;
		i=ii;     // integer unboxing
		System.out.println(i);
		
		
		//important
		Integer b1 =19;
		Integer b2 =19;
		System.out.println(b1==b2);     //same address returns true.   [ in range of integer cache (-128 to 127)( means number in heap not duplicated)]
		Integer c1 =190;
		Integer c2 =190;
		System.out.println(c1==c2);     // different address returns false.

	}

}
