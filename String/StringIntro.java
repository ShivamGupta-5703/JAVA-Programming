package String;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str1 = "hello";
		String st = new String("hello");
		String st1 = new String("hello");
		
		System.out.println(st1.length());
		
		System.out.println(st1 == st);   // == compares addresss in non primitive datatypes
		
		System.out.println(st1.equals(st1));   // compares content
		
		System.out.println(st1.charAt(4));
		
		System.out.println(st1.substring(3,5));
		System.out.println(st1.substring(3));
		String stri = st1.substring(3);
		System.out.println(stri);
		System.out.println(stri.substring(1,1 ));   //returns nothing
		
		System.out.println(stri.concat(str));
		
		System.out.println(stri.compareTo(str1));   // +ve if stri >str1,else -ve.   //compares according to dictionary.
		
		System.out.println(str1 +10 +40);
		System.out.println(str1 +(10 +40)+50);

	}

}
