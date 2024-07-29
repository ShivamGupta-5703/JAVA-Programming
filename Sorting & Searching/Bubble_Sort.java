//In bubble sort,hum left side se element pick krte h,then usko compare krte h baaki elements se and swap krte h.Then,jab last element fix
// ho jata h,toh hum last element check nhi karenge toh second loop ek iteration kam chalegi 
package Sorting;

public class Bubble_Sort {

	public static void main(String[] args) {
		int n[] = { 1, 3, 2, 7, 9, 4 };
		sort(n);

	}

	public static void sort(int n[]) {
		for (int j = 0; j < n.length-1; j++) {
			for (int i = 0; i < n.length - j-1; i++) {
				if (n[i] > n[i + 1]) {
					int temp = n[i];
					n[i] = n[i + 1];
					n[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
	}

}
