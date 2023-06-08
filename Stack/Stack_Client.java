package Stack;

//Static Stack.

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(10); 
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.isFull());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		st.Display();
	}
}
