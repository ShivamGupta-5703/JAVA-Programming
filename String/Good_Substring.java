// which only contains vowel.
package String;

public class Good_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="cbaeicde";
		
		printLength(str);

	}
	public static void printLength(String str) {
		int length =0;
		int count =0;
		for(int i=0;i<str.length();i++) {
			if( isVowel(str.charAt(i))) {
				count++;
			}
			else {
				length = Math.max(count, length);
				count=0;
			}
		}
		System.out.println(length);
	}
	
	public static boolean isVowel(char ch) {
		if(ch =='a' || ch =='e' ||ch == 'i' ||ch == 'o' || ch =='u' ){
			return true;
		}
		return false;
	}

}
