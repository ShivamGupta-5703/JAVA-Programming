
public class Swap_Elements {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int a = 10;
		int[] arr = { 10, 20, 30, 40, 50 };
		// int[] other = arr;
		System.out.println(arr[0] + " " + arr[1]);// 10 20
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]); // no change becoz swap function changes apne local variables me karega.
		
		swap1(arr,0,1);  // arr = address of array
		 System.out.println(arr[0] + " " + arr[1]); // here swap takes place becoz elements of arr are swapped. 
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

	}
	public static void swap1(int arr[] , int i,int j) {  //isme humne address of array pass kiya h , toh changes arr array me honge.
		int temp =arr[i];
		arr[i] =arr[j];
		arr[j] = temp;
	}

}

//a= a+b
//b= a-b
//a = a-b

//a= a^b
//b= a^b
//a =a^b

//c=a;
//a=b
//b=c

//a= a*b
//b= a/b
//a= a/b

//a = b+a-(b=a)
