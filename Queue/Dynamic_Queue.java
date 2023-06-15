package Queue;

public class Dynamic_Queue extends Circular_Queue{
//Same as stack --> double size ka array banega, saare eleemnts naye array me copy honge nad front of queue will comes to index 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void EnQueue(int item) throws Exception{
		if(isFull()) {
			int newarr[] = new int[2*arr.length];
			
			for(int i=0;i<arr.length;i++) {
				
				int index = (front+i)%arr.length;
				newarr[i] = arr[index] ;
			}
			arr=newarr;
			front=0;
		}
		super.EnQueue(item);  //jab tak size increase ka issue na ho tab tak original enqueue hi execute hoga.
	}
}
