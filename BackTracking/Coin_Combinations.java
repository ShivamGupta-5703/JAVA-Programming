package BackTracking;

public class Coin_Combinations {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {2, 3, 5, 6};
		int amount =10;
		printcombination(coin,amount,"",0);

	}
	
	public static void printcombination(int[] coin, int amount,String ans,int index) {
		
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		
		for(int i=index;i<coin.length;i++) {
			if(amount>=coin[i]) {
				printcombination(coin,amount - coin[i],ans+coin[i]+" ",i);
				//not i+1 kyuki same coin use kar skte h .If we do not have duplicate coins then i+1. 
				//eg 211 ek combination h 4 ke liye,agar i+1 pass karenge toh 1 dobara nhi aa payega
				//combination mtlb agar 211 aaya toh 121 ya 112 na aaye,toh coin repeat ho skta h
			}
		}
		
		
	}
}
