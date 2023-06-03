package LinkedList;


//LeetCode - 160 -->
public class Intersection_of_Two_Linked_Lists {
	
	//given by leetcode 
    public  class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { 
	    	val = x; 
	    	next = null; 
	    }
	}
    
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
             ListNode Shivam = headA; 
             ListNode Monu = headB;
             while(Shivam!=Monu) {
            	 if(Shivam==null) {
            		 Shivam=headB;
            	 }else {
            		 Shivam = Shivam.next;
            	 }
            	 if(Monu==null) {
            		 Monu = headA;
            	 }else {
            		 Monu = Monu.next;
            	 }
             }
             return Shivam;
        }
    }
}
