package Stack;
import java.util.Stack;
public class Insert_Bottom_in_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Insert_Button(st,-9);    //insert as the first element of stack.
		System.out.println(st);
	}
	public static void Insert_Button(Stack<Integer> st,int item) {
		
		//Method 1 -> Use another stack   /O(n)
		//Method 2 -> Without using extra space (Recursion)(constant space)  Time Complexity - O(n),Space -> O(n)[n call stack n complexity]
		//works because queue is LIFO symantic.
		if (st.isEmpty()) {
			st.push(item);
			return;
		}

		int ii = st.pop();
		Insert_Button(st, item);
		st.push(ii);
	}

}
//If we dont count call stacks space then O(1)