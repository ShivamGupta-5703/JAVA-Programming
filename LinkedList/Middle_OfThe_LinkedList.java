package LinkedList;
//LeetCode - 876
public class Middle_OfThe_LinkedList {

	
	//Method 1 --> Traverse list and find size, the using size find if its even or odd and then using Get node function return the middle node.
	//Method 2 --> Without length or counting nodes ,find middle node;
	
	class Solution{
		public ListNode middleNode(ListNode head) {
			ListNode slow = head; 
			ListNode fast = head; 
			while(fast!=null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}
	}
	
	//given by leetcode 
    public  class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { 
	    	this.val = val; 
	   	}
	    ListNode(int val, ListNode next) { 
	    	this.val = val; 
	    	this.next = next; 
	    }
	}
	

}
  