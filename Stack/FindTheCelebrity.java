package Stack;
// LeetCode 277 -->
import java.util.Stack;
public class FindTheCelebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		System.out.println(Celebrity(arr));
	}

	private static int Celebrity(int[][] arr) {
		Stack<Integer> st = new Stack<>();
		//push all indexes of elments in stack
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		// Elimination
		while (st.size() > 1) {
			//pop 2 elements and check if they are celebrity or not.
			// if arr[a,b]  ==1 means a knows b so a is not a celebrity so push b.
 			int a = st.pop();
			int b = st.pop();
			if (arr[a][b] == 1) {
				st.push(b);
			} else {
				st.push(a);
			}
		}
		//store last element of stack in variable,this is the last element which can be our celebrity.
		//for this element to be celebrity entire row and column needs to be 0.
		//for i equal to candidate we do not check because every one knows themselves
		int cand = st.pop();
		for (int i = 0; i < arr.length; i++) {
			if (i == cand) {
				continue;
			}
			//arr[cand][i] != 0 --> candidate kisi ko na janta ho
			//arr[i][cand] == 0 -->koi candidate ko har koi janta ho
			if (arr[cand][i] != 0 || arr[i][cand] == 0) {
				return -1;
			}
		}
		return cand;
		
	}

}
