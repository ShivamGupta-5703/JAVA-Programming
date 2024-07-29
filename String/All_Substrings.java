<<<<<<< HEAD
package String;

public class All_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abcd";
		
		printSubstring(str);

	}
	
	public static void printSubstring(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

}
=======
package String;

public class All_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abcd";
		
		printSubstring(str);

	}
	
	public static void printSubstring(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

}
>>>>>>> 9265cfa644a9e9f746adec26738ce8d105dde8ba
