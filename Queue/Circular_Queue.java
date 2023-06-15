package Queue;

//Static Queue

public class Circular_Queue {


	protected int arr[];
	protected int front = 0;
	private int size= 0;
	
	public Circular_Queue() {
		arr = new int[5];
	}
	public Circular_Queue(int size) {
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size == arr.length;
	}
	public void EnQueue(int item) throws Exception{
		if(isFull()) {
			throw new Exception("kahan jagah h?");
		}
		int idx= (front+size)%arr.length;
		arr[idx] = item;
		size++;
	}
	public int DeQueue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Khali h !!");
		}
		int item = arr[front];
		front= (front+1)%arr.length;   //array ki length tak jaake phitr 0 pe start hoga
		size--;
		return item;
	}
	public int size() {
		return size;
	}
	public int getFront()throws Exception {
		if(isEmpty()) {
			throw new Exception("Khali h !!");
		}
		return arr[front];
	}
	public void Display() {
		for(int i=0;i<size;i++) {
			int idx = (front+i)%arr.length; 
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
	
	

}
