package Recursion;

public class print_all_subsequences_and_count {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		printSubsequence(str,"");
		System.out.println(count);
		
		System.out.print("\n"+printSubsequence1(str,""));
		//  \n se  ount next line aa jayega

	}
	
	//1st way  to count in recursion easiest way declare a static variable.-->
	public static void printSubsequence(String str,String ans) {
		
		if(str.length() ==0) {
			System.out.println(ans);
			count++;
			return;
		}
		char ch = str.charAt(0);
		printSubsequence(str.substring(1),ans);
		printSubsequence(str.substring(1),ans+ch);
	}

	//2nd Method -->
	public static int printSubsequence1(String str,String ans) {
		
		if(str.length() ==0) {
			System.out.print(ans+" ");
			
			return 1;
		}
		char ch = str.charAt(0);
		int f1 = printSubsequence1(str.substring(1),ans);
		int f2 = printSubsequence1(str.substring(1),ans+ch);
		return f1+f2;
	}
}




