package Stack;
// LeetCode 84 -->
import java.util.Stack;
public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,4,6,1,7};
		System.out.println(largestrectangle(arr));
	}
	public static int largestrectangle(int arr[]) {
		Stack<Integer> st = new Stack<>();  //contains index
		int max =0;  //answer
		
		for(int i=0;i<arr.length;i++) {
			
			while(!st.isEmpty() && arr[i] < arr[st.peek()]) { 
				// st.empty() --> to check if left minimum exist  eg =3
				// arr[i] < arr[st.peek()] --> to check for right  eg = 4
				
				//height of rectangle
				int height = arr[st.pop()];  // get height of rectangle example =5
				int right = i; //right minimum ith index h
				if(st.isEmpty()) {
					//agar stack empty h mtlb left minimum available nhi h toh sirf right use karenge
					int area = height * right;
					max= Math.max(max, area);
				}else {
					//peek gives left minimum 
					//height me element pop kiya h vo h isliye peek pe left minimum aaya
					
					//simply store maximum area in max
					int left = st.peek();
					int area = height*(right-left-1);
					max= Math.max(max, area);
				}
			}
			st.push(i);  //ith element kisi aur ka left minimum ban skta h,isliye push i.
		}
		
		//Now for the elements jo stack me reh gye the,unka bhi area nikalna padega
		int right = arr.length;  //right will be equal to array ka length.We presume that last index ke baad 0 element h taaki hum usko as a right minimum le ske.So we tak right as array length.
		while(!st.isEmpty()) { 
			int height = arr[st.pop()];
			if(st.isEmpty()) {
				int area = height * right;
				max= Math.max(max, area);
			}else {
				int left = st.peek();
				int area = height*(right-left-1);
				max= Math.max(max, area);
			}
		}
		
		return max; 	//return maximum area.
	}

}
