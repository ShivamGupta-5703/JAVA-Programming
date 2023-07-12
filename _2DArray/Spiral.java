package _2DArray;
import java.util.Scanner;

public class Spiral {
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
		spiral(arr);
		
	}
	public static void spiral(int arr[][]) {
		int minR = 0;
		int maxR = arr.length - 1;
		int minC = 0;
		int maxC = arr[0].length - 1;
		int totalcount = arr.length * arr[0].length;
		int count =0;
		while(count<totalcount){
            for(int i=minC;i<=maxC && count<totalcount;i++){
            	System.out.print(arr[minR][i]+" ");
                count++;
            }
            minR++;

            for(int i=minR;i<=maxR && count<totalcount;i++){
            	System.out.print(arr[i][maxC]+" ");
                count++;
            }
            maxC--;

            for(int i=maxC;i>=minC && count<totalcount;i--){
            	System.out.print(arr[maxR][i]+" ");
                count++;
            }
            maxR--;

            for(int i=maxR;i>=minR && count<totalcount;i--){
            	System.out.print(arr[i][minC]+" ");
                count++;
            }
            minC++;
        }
		
	}
}

//4
//4
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16