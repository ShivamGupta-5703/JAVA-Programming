package Lec1;

import java.util.*;

public class Pattern_31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = n;
			while (j > 0) {
				if(i==j) {System.out.print("*" + " ");}
				else {System.out.print(j + " ");}
				j--;
			}
			i++;
			System.out.println();
		}
		sc.close();
	}
}
