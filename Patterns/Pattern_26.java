package Lec1;
import java.util.*;
public class Pattern_26 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int k=1;
			for(int j=0;j<2*n;j++) {
				if(j>=n-i-1 && j<=n+i-1) {
					System.out.print(k+" "+" ");
					k++;
				}
				else {
					System.out.print(" "+" "+" ");
				}
				
			}System.out.println();
		}
		sc.close();
		
	}
	
}
