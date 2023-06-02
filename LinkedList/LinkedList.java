package LinkedList;

public class LinkedList {
	
	//Class Node   //sub-class(inner-class)
	public class Node{
		int val;
		Node next;
	} 
	//head - first node
	private Node head;
	
	//size of linked list
	private int size; 
	
	//tail - last node
	private Node tail;
	
//Different Methods in Linked List -->
	
//1.  AddFirst -->  Complexity O(1)
	public void AddFirst(int item) {
		//create new node
		Node nn = new Node();
		//assign item to that node
		nn.val = item;  
		//since it is addfirst we have to make this node as head node
		if(size==0) {
			//if no node present 
			head=nn;
			tail=nn;
			size++;
		} else {
			//previous head node ko next me daal do ,aur nn ko head bana do
			nn.next = head;
			head=nn;
			size++; //increase as node is added
		}	
	}
	
//2.  Display LinkedList -->
	public void Display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println(".");
	}
	
//3.  AddLast --> Complexity O(1)
	//if we are not using tail pointer than complexity would be O(n) because in that case we have traverse whole list till end to add last.
	public void AddLast(int item) { 
		if(size==0) {
			AddFirst(item);
		} else {
			//create new node
			Node nn = new Node();
			//assign item to that node
			nn.val = item; 
			tail.next =nn;
			tail=nn;
			size++; 
		}	
	}
	
//4. Get Node at given index-->Complexity O(n)
	//private because it is for only our use.
	private Node GetNode(int index) throws Exception{
		//if index is out of range
		if( index<0 || index>=size) {
			throw new Exception("Index out of range");
		}
		Node temp = head;
		for(int i=0;i<index;i++) {
			temp =temp.next;
		}
		return temp;
		
	}
	
//5. AddAtIndex -->Complexity O(n)
	public void AddAtIndex(int item,int index) throws Exception { 
		if(index==0) {
			AddFirst(item);
		} else if(index==size){
			AddLast(item);
		}else {
			//get node before index k
			Node temp=GetNode(index-1);
			
			//create new node and pass item to t
			Node nn = new Node();
			nn.val=item;
			// since we need to add ode at k index , we make kth.next equal to (k-1)th.next and make (k-1)th.next equal to kth node
			nn.next = temp.next;
			temp.next = nn;
			size++;   //increase size as we add a node.
		}	
	}

//6. GetFirst -->Complexity O(1)
	public int GetFirst() throws Exception{
		if(head == null) {
			throw new Exception("Head nhi h");
		}
		return head.val;
	}
	
//7. GetLast -->Complexity O(1)
	public int GetLast() throws Exception {
		if(head == null) {
			throw new Exception("Head nhi h");
		}
		return tail.val;
	}

//8. GetAtAnyIndex -->Complexity O(n)
	public int GetAtAnyIndex(int index) throws Exception {
		return GetNode(index).val;
	}

//9. RemoveFirst --> Complexity O(1)
	public int RemoveFirst() {
		Node temp = head;
		if (size == 1) {  //agar list ka size 1 toh humko list ka size 0 krna h ,hence head = null.
			head = null;
			tail = null;
		} else {
			//if size not 1,then move head to head.next and temp jisme original head h usko null kar do taaki link toot jaye  
			head = head.next;
			temp.next = null;
		}
		size--; //finally size kam kar deinge
		return temp.val;
	}

//10. RemoveLast --> Complexity O(1)
	public int RemoveLast() throws Exception {
		if (size == 1) {  //agar size 1 then we use removefirst.
			return RemoveFirst();
		} else {
			//else hum last node ke pehle wala node prev me store karenge aur temp me original tail node daal deinge
			//then tail me prev me store karengeand temp .val return kar deinge
			Node prev = GetNode(size - 2);
			Node temp = tail;
			tail = prev;
			tail.next = null;  //breakup with with previous tail
			size--;
			return temp.val;
		}
	}

//11. RemoveAtAnyIndex --> Complexity O(n)
	public int RemoveAtAnyIndex(int k) throws Exception {
		if (k == 0) {  //agar index zero, to remove first
			return RemoveFirst();
		} else if (k == size - 1) { //agar index size ke equal, to remove last
			return RemoveLast();
		} else {
			//else (k-1)th node ko yaad karo uska , kth node ko current me yaaa me karo ab prev ka next , current ke next ke equal kar do ,(this way we skip current node) and make current.next equal to null.
			Node prev = GetNode(k - 1);
			Node curr = prev.next; // GetNode(k);
			prev.next = curr.next;
			curr.next=null;
			size--;
			return curr.val;
	    }
	}
}
