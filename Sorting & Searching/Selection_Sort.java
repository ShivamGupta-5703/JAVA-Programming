//In selection sort, hum ek element select krte h , phir poori array me usse chota element agar exist krta h toh uske saath swapping krte h.
package Sorting;

public class Selection_Sort {

	public static void main(String[] args) {
		int n[] = { 1, 3,4,6,9,4,7 };
		sort(n);

	}

	public static void sort(int n[]) {
		for (int j = 0; j < n.length-1; j++) {
			for (int i = j; i < n.length  ; i++) {
				if (n[j] > n[i]) {
					int temp = n[j];
					n[j] = n[i];
					n[i] = temp;
				}
			}
		}
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
	}

}
