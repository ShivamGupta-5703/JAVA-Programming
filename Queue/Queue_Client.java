package Queue;

//Static Queue

public class Queue_Client {
	public static void main(String[] args) throws Exception{
		Linear_Queue q = new Linear_Queue();
		q.EnQueue(10); 
		q.EnQueue(20);
		q.EnQueue(30);
		q.EnQueue(40);
		q.EnQueue(50);
		System.out.println(q.isFull());
		System.out.println(q.DeQueue());
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		q.Display();
		
		System.out.println();
		System.out.println();
		
		Circular_Queue q1 = new Circular_Queue();
		q1.EnQueue(10);
		q1.Display();
		q1.EnQueue(20);
		q1.Display();
		q1.EnQueue(30);
		q1.Display();
		q1.EnQueue(40);
		q1.Display();
		q1.EnQueue(50);
		q1.Display();
		System.out.println(q1.DeQueue());
		System.out.println(q1.DeQueue());
		q1.EnQueue(60);
		q1.EnQueue(70);
		q1.Display();
		
	}
}
