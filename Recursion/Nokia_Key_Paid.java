package Recursion;

public class Nokia_Key_Paid {

	static String[] key = {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12";
		printkeypaid(str,"");
	}
	public static void printkeypaid(String str,String ans) {
		
		if(str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		
		
		char ch = str.charAt(0);  // 1 as a character. 1-->49 [ASCII value]
		//so we have to pass 49 -48 to get key at first index.
		String pressedkeystring = key[ch-48];
		
		
		for(int i=0;i<pressedkeystring.length();i++) {
			printkeypaid(str.substring(1),ans+pressedkeystring.charAt(i));
		}
		
		
	}

}
