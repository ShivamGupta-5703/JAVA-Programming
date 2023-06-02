package LinkedList;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.Display();
		ll.AddLast(-9);
		ll.AddLast(11);
		ll.Display();
		ll.AddAtIndex(-88,2);
		ll.Display();
		System.out.println(ll.GetAtAnyIndex(2));
		System.out.println(ll.GetFirst());
		System.out.println(ll.GetLast());
		
		System.out.println(ll.RemoveFirst());
		ll.Display();
		System.out.println(ll.RemoveLast());
		ll.Display();
		System.out.println(ll.RemoveAtAnyIndex(2));
		ll.Display();
	}
}
