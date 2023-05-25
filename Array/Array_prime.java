import java.util.*;
public class Array_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =10;
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			int count =0;
			for(int j=2;j<=a[i]/2;j++) {
				if(a[i]%j == 0) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(a[i]+" ");
			}
			else {
				continue;
			}
		}
		

	}

}
