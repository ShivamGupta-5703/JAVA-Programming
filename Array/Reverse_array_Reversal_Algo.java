package Array;

public class Reverse_array_Reversal_Algo {

	public static void main(String[] args) {
		int a[] = {10,20,5,7,11,9};
		int b[] = {10,20,5,7,11,9};
		Reverse(a);
		System.out.println();
		Reverse1(b);
		for(int i=0;i<a.length;i++) {
			System.out.print (a[i]+" ");
		}


	}
	public static void Reverse(int a[]){
		
		for(int i=0,j=a.length-1;i<a.length;i++,j--) {
			if(i<j) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			else {
				break;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print (a[i]+" ");
		}
	}
public static void Reverse1(int b[]){
		
		for(int i=0,j=b.length-1;i<b.length;i++,j--) {
			if(i<j) {
				int temp = b[i];
				b[i]=b[j];
				b[j]=temp;
			}
			else {
				break;
			}
		}
		
	}
	

}
