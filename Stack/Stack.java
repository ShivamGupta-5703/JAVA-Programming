package Stack;

//Static Stack.

public class Stack {

	//int arr[];  // agar esse hi chod diya toh client array ka koi bhi index access kar skta h,but stack me last input hi access kar skte h
	protected int arr[];  
	//constructor isliye banaya kyuki yaha pe array define nhi kiya,toh vo null aayega har baar
	//agar yaha pe size pehle se assign kar diya for example x ,then humesha x size ka stack hi banega.
	
	//now we keep track of index for the last input in our array[stack] 
	private int top=-1;   //initially stack empty.
	
	//agar user size na de, toh by default array[stack] ka size 5
	public Stack() {
		arr = new int[5];
	}
	public Stack(int size) {
		arr = new int[size];
	}
	
	// if stack is empty
	public boolean isEmpty() {
		return top==-1;
	}
	
	//if stack is full . This will not be used if our stack is dynamic because stack will never be full.
	public boolean isFull() {
		return top== arr.length-1;
	}
	
	public void push(int item) throws Exception{
		
		if (top== arr.length-1) {   //agar space bhar gai toh generate exception
			throw new Exception("Kahan jagah h?"); 
		}
		
		top++;   //initially top -1 h ,mtlb koi elemenet nhi h .Pehli index 0 hoti h toh hum top ko ++ karenge phir element stack me place karenge.
		arr[top]=item;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Khali h !!");
		}
		int item = arr[top];
		top--;
		return item;
	}
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("Khali h !!");
		}
		int item = arr[top];
		return item;
	}
	public int size() {
		return top+1;     //initially top -1 h toh +1 karke size 0 aayega.
	}
	
	public void Display() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
