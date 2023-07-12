package Leet;
import java.util.Scanner;

public class TWo_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=i;k<n;k++) {
			if(a[i]+a[k]==target) {
				System.out.print(i+","+k);
				break;
			}
			else {
				continue;
			}
			}
		}
		sc.close();
	}

}
