package Lec1;

import java.util.*;

public class Pattern_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = n;
			while (j >= i) {
				System.out.print("*" + " ");
				j--;
			}
			i++;
			System.out.println();
		}
		sc.close();
	}
} 