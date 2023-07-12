package String;

public class Palindromic_Substring_N2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "NITIN";
		System.out.println(CountPalindromic(str));

	}
	public static int CountPalindromic(String str) {
		int count=0;
		//odd count
		for(int axis=0;axis<str.length();axis++) {
			for(int orbit =0;axis-orbit>=0 && axis+orbit<str.length();orbit++) {
				if(str.charAt(axis-orbit)!=str.charAt(axis+orbit)) {
					break;
				}
				count++;
			}
		}
		//even count
		for(double axis=0.5;axis<str.length();axis++) {
			for(double orbit =0.5;axis-orbit>=0 && axis+orbit<str.length();orbit++) {
				if(str.charAt((int)(axis-orbit))!=str.charAt((int)(axis+orbit))) {
					break;
				}
				count++;
			}
		}
		return count;
	}

}
