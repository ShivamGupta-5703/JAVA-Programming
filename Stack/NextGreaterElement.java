package Stack;
import java.util.Stack;

//Hum starting se dekhenge ki ith element kiska next greater element banega.
//Jiska next greater nhi banega uska index yaad kar leinge aur wait karenge ki further next greater element mil jaye agar nhi toh at last place -1.
//Starting element kisi ka next nhi banega

//Humne stack isliye choose kyuki agar arraylist lete toh top element ke liye poora array  traverse kar lete har element ke nge liye ,but humne ek ek element ka nge nikalna sabka nhi dekhna
//aur arraylist me deletion ke case me shifting hoti h O(n) , and insertion me do steps hote h which makes complexity O(n),but stack me push pop operation ke liye complexity O(1) hoti h.

//Suppose 13 ke liye hume 9 ,11 h agar uske pehle 55 hota ,and uske pehle 5,6 toh arraylist me hum 13 se leke 5 tak chale jate , but stack me sirf top element excess karte h,toh hum 55 tak jayenge
//use arraylist bhi kar skte h but vo time zyada leta h.
public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,9,13,21,3};     // Ans --> [13 13 21 -1 -1]
		NGE(arr);
		
	}
	public static void NGE(int arr[]) {
		
		//for storing next greater elements.
		int ans[] = new int[arr.length];
		//for storing index of elements jinka next greater abhi nhi mila.
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			
			//elements  nikalo stack se agar hume stack.peek() index se bada element mil gya jo ki uska nge hoga, aur uss index me arr[i] daal diya 
			while(!st.isEmpty() && arr[st.peek()]<arr[i]) {	
				ans[st.pop()]  =arr[i];
			}
			//agar next nhi mila toh vo index stack me dalo
			st.push(i);  //O(1)
		}
		
		//jinka nge nhi exist krta unke saamne -1 put kar do.
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
		
		//display elements with their nge.
		for(int i=0;i<ans.length;i++) {
			System.out.println(arr[i]+" "+ans[i]);
		}
		
	}

	
	//stack ke andar saare element daal rhe h ,n element daalne ki complexoty O(n)  {for loop me st.push(i)}
	//next while loop sirf element bahar kar rha h , worst case me n elements, time complexity O(n)     {kuch elements for loop me nikal rhe h,kuch next while loop me ,total n}
	//total O(n)+O(n)=O(n)
}
