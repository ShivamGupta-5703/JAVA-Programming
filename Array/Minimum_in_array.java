import java.util.Scanner;

public class Minimum_in_array {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a[] = {10,-3,90,7,-9,-79,-18,902};
	System.out.println(Min(a));
	
	}
	public static int Min(int a[]){
		int min = a[0];
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		return min;
	}

}
