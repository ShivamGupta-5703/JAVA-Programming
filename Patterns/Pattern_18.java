package Lec1;
import java.util.*;
public class Pattern_18 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		int row = 1;
		int stars = 1;
		int spaces = n/2;
		while (row <= n ) {
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

			if (row <= n/2) {
				stars=stars+2;
				spaces--;
			} else {
				stars=stars-2;
				spaces = spaces +1;
			}
			row++;
			System.out.println();
		}
		sc.close();
	}
	
}
