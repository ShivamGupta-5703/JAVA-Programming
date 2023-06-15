package Queue;

public class Linear_Queue {

	private int arr[];
	private int front = 0;
	private int rear = 0;
	
	public Linear_Queue() {
		arr = new int[5];
	}
	public Linear_Queue(int size) {
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		return rear==0;
	}
	public boolean isFull() {
		return rear == arr.length;
	}
	public void EnQueue(int item) throws Exception{
		if(isFull()) {
			throw new Exception("kahan jagah h?");
		}
		arr[rear] = item;
		rear++;
	}
	public int DeQueue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Khali h !!");
		}
		int item = arr[front];
		front++;
		return item;
	}
	public int size() {
		return rear-front;
	}
	public void Display() {
		for(int i=front;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
