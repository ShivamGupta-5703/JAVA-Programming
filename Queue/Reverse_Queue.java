package Queue;
//Reverse in Constant space.
public class Reverse_Queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Circular_Queue q = new Circular_Queue();
		q.EnQueue(10);
		q.EnQueue(20);
		q.EnQueue(30);
		q.EnQueue(40);
		q.EnQueue(50);
		q.Display();
		Reverse(q);
		q.Display();
	}

	public static void Reverse(Circular_Queue q) throws Exception {
		//Method 1 -> Use stack.
		//Method 2 -> Recursion.   //works because queue is FIFO symantic.
		
		if (q.isEmpty()) {
			return;
		}
		int ii = q.DeQueue();
		Reverse(q);
		q.EnQueue(ii);

	}
}
//If we dont count call stacks space then O(1)