package Pattern;

import java.util.Scanner;

public class Pattern_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<2*n-1;j++) {
				if(j>=n-1-i&&j<=n-1+i) {
					if((i+j)%2==0) 
					{System.out.print("*"+" ");
					}
					else {
						System.out.print(" "+" ");
					}
				}
				else {
					System.out.print(" "+" " );
				}
			}
			System.out.println();
		}sc.close();

	}

}
