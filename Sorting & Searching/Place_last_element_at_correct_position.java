package Sorting;
//last element correctly place karo , jisse uske pehle saare chote aur uske baad saare bade elements ho.
public class Place_last_element_at_correct_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,7,2,3,8,1,4};
		int index = 0; //index jaha pe last element place krna chahiye
		int item = arr[arr.length-1];  //jo item place krna h
		int si = index; //starting index
		int ei = arr.length-1;  //last element to place krna h toh uspe pehle tak loop chalega.
		for(int i=si;i<ei;i++) {
			if(arr[i]<=item) {  //< - for non duplicate // <= for duplicate elements
				swap(arr,index,i);
				index++;
			}
		}
		swap(arr,ei,index);     //jo index correct hogi usse swap kar diya
		display(arr);
	}
	public static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
