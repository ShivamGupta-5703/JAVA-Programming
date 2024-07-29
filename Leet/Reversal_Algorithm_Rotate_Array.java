package Leet;

public class Reversal_Algorithm_Rotate_Array {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		int l =3;
		int k = l  % a.length;
		Reverse(a,(a.length-k),(a.length-1)); //last half reverse
		Reverse(a,0,a.length-k-1); //first half reverse
		Reverse(a,0,(a.length-1)); // full array reverse
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void Reverse(int a[], int m, int n) {

		for (int i = m, j = n;; i++, j--) {
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			} else {
				break;
			}
		}

	}
}