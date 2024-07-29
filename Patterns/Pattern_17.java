package Lec1;

public class Pattern_17 {
	public static void main(String[] main) {
		System.out.println("stars");
		int n = 7;
		int rows = 1;
		int stars = n / 2;
		int spaces = 1;
		while (rows <= n) {

			// stars
			int i = 1;
			while (i <= stars) {
				System.out.print("*" + " ");
				i++;
			}
			// spaces
			int j = 1;
			while (j <= spaces) {
				System.out.print(" " + " ");
				j++;
			}
			// stars
			int k = 1;
			while (k <= stars) {
				System.out.print("*" + " ");
				k++;
			}
			if (rows<= n/2) {
				stars--;
				spaces +=2;
			} else {
				stars++;
				spaces-=2;
			}
			rows++;
			System.out.println();
		}
	}
}
