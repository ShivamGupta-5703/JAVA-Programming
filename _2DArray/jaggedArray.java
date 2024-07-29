package _2DArray;

import java.util.Scanner;

public class jaggedArray {   //row size is fixed,but column size varies.  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();     //row
		int arr[][] = new int[n][];
		for(int i=0;i<arr.length;i++) {
			int m =sc.nextInt();  //column
			arr[i] = new int[m];
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			 System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
