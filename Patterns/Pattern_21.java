package Lec1;

import java.util.Scanner;

public class Pattern_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=0;j<2*n-1;j++) {
				if(j>n-i  && j<n+i-2) {
					System.out.print(" "+" ");
				}
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
