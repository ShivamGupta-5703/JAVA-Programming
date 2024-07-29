package Lec1;

public class Pattern_20 {
	public static void main(String[] main) {
		System.out.println("stars");
		int n = 7;
		int rows = 1;
		int spaces1 = n / 2;
		int spaces2 = -1;
		while (rows <= n) {
			// spaces
			int k = 1;
			while (k <= spaces1) {
				System.out.print(" " + " ");
				k++;
			}
			// stars

				System.out.print("*" + " ");

			// spaces
			int j = 1;
			while (j <= spaces2) {
				System.out.print(" " + " ");
				j++;
			}
			// stars
				if(rows!=1 && rows!=n) {
				System.out.print("*" + " ");}


			if (rows <= n / 2) {
				spaces1--;
				spaces2+=2;
			} else {
				spaces1++;
				spaces2-=2;
			}
			rows++;
			System.out.println();
		}
	}
}