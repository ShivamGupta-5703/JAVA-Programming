package Lec1;
import java.util.*;
public class Pattern_28 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int k=i;
			for(int j=0;j<2*n;j++) {
				if(j>=n-i-1 && j<=n+i-1) {
					if(j<n) {
						k++;
						System.out.print(k+" "+" ");}

					else if(j>n || j<2*n){
						k--;
						System.out.print(k+" "+" ");
					}

				}
				else {
					System.out.print(" "+" "+" ");
				}
				
			}System.out.println();
		}sc.close();
		
	}
	
}
