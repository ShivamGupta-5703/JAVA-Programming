package Pattern;

import java.util.*;

public class Pattern_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print("*" + " ");
				j++;
			}
			i++;
			System.out.println();
		}
		sc.close();
	}
}
