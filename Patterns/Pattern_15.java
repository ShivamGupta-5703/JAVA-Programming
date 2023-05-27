package Lec1;

import java.util.Scanner;

public class Pattern_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		int row = 1;
		int stars = n;
		int spaces = 0;
		while (row <= 2 * n - 1) {
			// spaces
			int j = 1;
			while (j <= spaces) {
				System.out.print(" " + " ");
				j++;
			}
			// stars
			int i = 1;
			while (i <= stars) {
				System.out.print("*" + " ");
				i++;
			}

			if (row < n) {
				stars--;
				spaces = spaces + 2;
			} else {
				stars++;
				spaces = spaces - 2;
			}
			row++;
			System.out.println();
		}
		sc.close();

	}
}
