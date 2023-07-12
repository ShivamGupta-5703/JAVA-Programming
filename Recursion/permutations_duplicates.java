package Recursion;

public class permutations_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aba";
		printpermute(str,"");

	}
	public static void printpermute(String str,String ans) {
		 if(str.length()==0) {
			 System.out.println(ans);
			 return;
		 }
		 for(int i=0;i<str.length();i++) {
			 
			 
			 char ch = str.charAt(i);
			 boolean flag = true;
			 for(int j=i+1;j<str.length();j++) {
				 if(str.charAt(j) == ch) {
					 flag=false;
					 break;
				 }
			 }
			 if(flag==true) {
				 String nextstr = str.substring(0,i)+str.substring(i+1);
				 printpermute(nextstr,ans+ch);
			 }
		 }
	}

}
