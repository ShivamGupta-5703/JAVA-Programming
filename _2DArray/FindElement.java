package _2DArray;

import java.util.Scanner;

public class FindElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int target = sc.nextInt();
		
		//Brute Force
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++){
//				if(arr[i][j]==target) {
//					System.out.print("1");
//				}
//			}
//		}
		System.out.println(search(arr,target));
	}
	
	public static int search(int arr[][],int target) {
		int row=0;
		int column = arr[0].length -1;
		
		while(column>=0 && row <arr.length) {
			if( arr[row][column] == target) {
				return 1;
			}
			else if(arr[row][column] < target) {
				row++;
			}
			else {
				column--;
			}
		}
		return 0;
	}
}



//3 3 
//3 30 38
//44 52 54 
//57 60 69 
//60
 