package Stack;
import java.util.Stack;
public class Stock_Span_Sunny_Building {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,6,4,18,7,5,11,19};
		stockspan(arr);
		

	}
	public static void stockspan(int arr[]) {
		Stack<Integer> st = new Stack<>();  //index store karega
		int ans[] = new int[arr.length];   //span store karega 
		
		for(int i=0;i<arr.length;i++){
			
			while(!st.empty() && arr[i]>=arr[st.peek()]) {
				st.pop();  // element 6 aaya 1 se bada toh pop 1, 3 se bada toh 3 phir stack empty ,if chalega and ith index pe ans array me i+1 store hoga
			}
			
			//calculate span
			if(st.empty()) {
				ans[i] = i + 1;  //agar stack empty h toh mtlb saare elements span banega ith index ka jo bhi uske phele ,ye number will be given by index of ith element aur kyuki ith element will also bhi included in its span and index is zero base so we add 1 to it.
			}
			else {
				ans[i] = i - st.peek();   // suppose array h [18,7,5,11] toh 11 ka span hoga 11,5,7 vo 18 ko cover nhi kar payega toh uska aayega 11 ka index minus 18 ka index[3-0=3];
			}
			
			st.push(i);   // ith element ko stack me push krna kyuki vo kisi ka span ban skta h
		}
		
		//display elements with their span.
		for(int i=0;i<ans.length;i++) {
			System.out.println(arr[i]+" "+ans[i]);
		}	
	}

}
 