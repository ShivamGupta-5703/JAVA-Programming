package Lec1;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		for(int i=0;i<2*n;i++) {
			for(int j=n;j>0;j--) {
				if((i<n&&j<=i)||(i>=n&&j<=2*n-i)) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}