package Stack;

public class Dyamic_Stack_Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Dynamic_Stack ds = new Dynamic_Stack();
		//Dynamic stack extends Stack class
		//Stack me empty constructor which makes array me size 5
		//so here  ds is stack of size 5
		//So we update push function of stack class,by writing it in dynamic stack.
		
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.Display();
	}

}
