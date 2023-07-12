package Recursion;

public class N_coins_outcomes_no_consecutive_heads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		coinToss(n,"");
	

	}
	public static void coinToss(int n,String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		if(ans.length() ==0 || ans.charAt(ans.length()-1)!='H') {
			coinToss(n-1,ans+"H");
		}
		coinToss(n-1,ans+"T");
	}
}
