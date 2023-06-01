package Lec1;

import java.util.Scanner;

public class Pattern_33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<2*n-1;j++) {
				int k=j+1;
				if(j>=n-1-i&&j<=n-1+i) {
					if(j<n-1) {
					System.out.print(k+" " );
					}
					else if(i>=0 &&j==n-1) {
					System.out.print(0+" " );
					}
					else if(j>n-1 ||j<2*n-1) {
						System.out.print((2*n)-j-1+" " );
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