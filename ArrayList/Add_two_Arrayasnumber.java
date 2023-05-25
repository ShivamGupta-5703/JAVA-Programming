package ArrayList;

import java.util.*;

public class add2arrayasnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = {2,3,4,6};
		int a2[] = {8,3,5,3,4,7,6};
		Addnumbers(a1,a2);
	}
	public static void Addnumbers(int a1[],int a2[]) {
		ArrayList<Integer> ll = new ArrayList<>();
		int i = a1.length-1;
		int j = a2.length-1;
		int carry =0;
		while(i>=0 && j>=0) {
			int sum = a1[i]+a2[j]+carry;
			ll.add(sum%10);
			carry = sum/10;
			i--;
			j--;
		}
		while(i>=0) {
			int sum = a1[i]+carry;
			ll.add(sum%10);
			carry = sum/10;
			i--;
		}
		while(j>=0) {
			int sum = a2[j]+carry;
			ll.add(sum%10);
			carry = sum/10;
			j--;
		}
		if(carry>0) {
			ll.add(carry);
		}
		for(int k = ll.size()-1;k>=0;k--) {
			System.out.print(ll.get(k)+" ");
		}
	}
}
