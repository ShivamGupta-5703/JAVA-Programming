package String;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="nitin";
		
		printPalindrome(str);

	}
	
	public static void printPalindrome(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String st = str.substring(i,j);
				if(isPalindrome(st)) {
					System.out.println(st);
				}
				
			}
		}
	}
	
	public static boolean isPalindrome(String str) {
		
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			
			if(str.charAt(i)!= str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
