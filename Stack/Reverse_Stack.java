package Stack;
import java.util.Stack;
public class Reverse_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Reverse(st);
		System.out.println(st);
	}

	public static void Reverse(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;
		}
		int ii = st.pop();
		Reverse(st);
		Insert_Bottom(st, ii);

	}

	public static void Insert_Bottom(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}

		int ii = st.pop();
		Insert_Bottom(st, item);
		st.push(ii);
	}

}
//Time Complexity ->  O(n^2)     //2 recursive call ek doosre ke andar.
//Space Complexity ->O(n)
//If we dont count call stacks space then O(1)