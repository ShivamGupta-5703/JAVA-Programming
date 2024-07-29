// Har element khud me sorted hota h
// in insertion sort hum ek element leinge ,first element sorted,usko array ke baaki elements se compare karenge ,agar koi chota h toh usko
// first element ke pehle insert karenge,else second element humari first element ke baad aayega,phir next element leinge agar vo nai array 
// jisme first and second element h  uske elements se chota h toh uske pehle aayega vrna end me insert ho jayega. 
package Sorting;

public class Insertion_Sort {
	public static void main(String[] args) {
		int n[] = { 1, 3,4,6,9,4,7 };
		sort(n);

	}

	public static void sort(int n[]) {
		//i loop for original array.
		for (int i = 1; i < n.length-1; i++) {
			int j=i-1;
			int temp = n[i];
			while(j>=0 && n[j]>temp) {
				n[j+1]=n[j];
				j--;
			}
			j++;
			n[j] = temp;
			
		}
		
		
		
		
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
	}
}
