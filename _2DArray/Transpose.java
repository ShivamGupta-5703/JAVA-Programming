package _2DArray;

import java.util.Scanner;

public class Transpose {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		//Normal Column Row Exchange Method -->.
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++){
//				System.out.print(arr[j][i]+" ");
//			}
//		}
		//Swapping Method -->
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[i].length;j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
		}
		
	}
}
