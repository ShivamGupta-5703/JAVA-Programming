package Leet;
import java.util.*;
public class LC_40_CombiantionSum2 {
	public static void main(String[] args) {
		int[] coin = {10,1,2,7,6,1,5};
		Arrays.sort(coin);
		int target = 8;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		printcombination(coin,target,ll,0,ans);
		System.out.println(ans);
	}
	public static void printcombination(int[] coin, int amount,List<Integer> ll,int index,List<List<Integer>> ans) {
		if(amount == 0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=index;i<coin.length;i++) {
			
			
			//adding this line to stop permutations duplicate pe loop nhi chalega.
			if( i != index &&coin[i] == coin[i-1])     // i!=index indicates we are not at first element
				//isme hum pehle coin use kar rhe, then check karenge uska next  element same toh nhi.if yes then usko skip kar deinge by continue.
				// next element isliye kyuki array sorted h , so agar elements duplicate h toh vo consecutive honge.
				continue;
			
			if(amount>=coin[i]) {
				ll.add(coin[i]);
				printcombination(coin,amount - coin[i],ll,i+1,ans);  
				//i+1 means coins are not infinite.  
				// 1 select hoga phir agla element and phir uska agla element.
				//i+1 se hum coin ko ek aage push kar rhe h mtlb agar 1 uthaya uske baad vo use nhi hoga agle element se traversing start hogi.
				ll.remove(ll.size()-1);    
			}
		}
	}
}