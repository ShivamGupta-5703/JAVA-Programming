package LinkedList;

//Floyed Cycle Removal Algorithm.

public class LinkedList_Cycle_Removal_Algorithm {
		public class Node{
			int val;
			Node next;
		} 
		private Node head;
		private int size; 
		private Node tail;
		public void AddFirst(int item) {
			Node nn = new Node();
			nn.val = item;  
			if(size==0) {
				head=nn;
				tail=nn;
				size++;
			} else {
				nn.next = head;
				head=nn;
				size++;
			}	
		}
		public void Display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.val+"->");
				temp = temp.next;
			}
			System.out.println(".");
		}
		public void AddLast(int item) { 
			if(size==0) {
				AddFirst(item);
			} else {
				Node nn = new Node();
				nn.val = item; 
				tail.next =nn;
				tail=nn;
				size++; 
			}	
		}
		private Node GetNode(int index) throws Exception{
			if( index<0 || index>=size) {
				throw new Exception("Index out of range");
			}
			Node temp = head;
			for(int i=0;i<index;i++) {
				temp =temp.next;
			}
			return temp;
			
		}
		//intentionally creating cycle -
		public void CreateCycle() throws Exception{
			Node nn = GetNode(2);
			tail.next =nn;  //creating cycle by connecting last node to second node
		}
		
		//check cycle
		public Node hasCycle(Node head) {
	    	Node slow = head; 
			Node fast = head; 
			while(fast!=null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast) {
					return slow;
				}
			}
			return null;
	    }
		
		//Method -1 --> Brute Force | O(n^2)
		public void RemovalCycle1() {
			Node meet = hasCycle(head);
			if(meet == null) {
				return; //no cycle present
			}
			Node start = head;
			while(start!=null) {
				Node temp =meet;
				while(temp.next!=meet) {
					if(temp.next == start) {
						temp.next = null;
						return;
					}
					temp = temp.next;
				}
				start = start.next;
			}
		}
		
		//Method -2 -->  ## REFER NOTES ## | O(n)
		public void RemovalCycle2() {
			Node meet = hasCycle(head);
			if(meet == null) {
				return; //no cycle present
			}
			//find length of circular distance "m"
			int count=1;
			Node temp =meet;
			while(temp.next!=meet) {
					count++;
					temp = temp.next;
			}
			
			//monu covers distance equal to length of circular path to reach point C
			Node fast = head;
			for(int i=0;i<count;i++) {
				fast = fast.next;
			}
			
			// Shivam and monu both walks "n" distance to meet at point B(D)
			Node slow = head;
			while(slow.next!=fast.next) {
				slow=slow.next;
				fast=fast.next;
			}
			//when they meet to break cycle we make fast.next = null.
			fast.next = null;
		}
		
		//Method -3 --> Floyed Cycle Detection Algorithm | O(n)
		public void FloyedCycleRemoval() {
			Node meet = hasCycle(head);
			if(meet == null) {
				return; //no cycle present
			}
			Node slow = head;
			Node fast = meet;
			while(slow.next!=fast.next) {
				slow=slow.next;
				fast=fast.next;
			}
			fast.next = null;
		}
		
		public static void main(String[] args) throws Exception {
			LinkedList_Cycle_Removal_Algorithm c1 = new LinkedList_Cycle_Removal_Algorithm();
			c1.AddLast(10);
			c1.AddLast(20);
			c1.AddLast(30);
			c1.AddLast(40);
			c1.AddLast(50); 
			c1.AddLast(60);
			c1.AddLast(70);
			c1.AddLast(80);
			c1.CreateCycle();
			//c1.RemovalCycle1();
			//c1.RemovalCycle2();
			c1.FloyedCycleRemoval();
			c1.Display();
		}
}
