package Lec1;
import java.util.*;
public class Pattern_25 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		int k=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<2*n;j++) {
				if(j>=n-i-1 && j<=n+i-1) {
					if(k<9) {
					System.out.print(k+" "+" ");}
					else {
						System.out.print(k+" ");
					}
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
