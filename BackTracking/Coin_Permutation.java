<<<<<<< HEAD
package BackTracking;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {2, 3, 5, 6};
		int amount =10;
		printPermutation(coin,amount,"");

	}
	
	public static void printPermutation(int[] coin, int amount,String ans) {
		
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		
		for(int i=0;i<coin.length;i++) {
			if(amount>=coin[i]) {
				printPermutation(coin,amount - coin[i],ans+coin[i]+" ");
			}
		}
		
	}

}
=======
package BackTracking;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {2, 3, 5, 6};
		int amount =10;
		printPermutation(coin,amount,"");

	}
	
	public static void printPermutation(int[] coin, int amount,String ans) {
		
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		
		for(int i=0;i<coin.length;i++) {
			if(amount>=coin[i]) {
				printPermutation(coin,amount - coin[i],ans+coin[i]+" ");
			}
		}
		
	}

}
>>>>>>> 9265cfa644a9e9f746adec26738ce8d105dde8ba
