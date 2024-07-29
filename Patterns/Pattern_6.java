package Lec1;

import java.util.Scanner;

public class Pattern_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n+i;j++) {
				if(j<2*i) {
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
