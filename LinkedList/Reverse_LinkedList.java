package LinkedList;

// LeetCode - 206 
public class Reverse_LinkedList {
	
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
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode current = head;
            ListNode prev = null;
            
            while(current!=null) {
            	ListNode temp = current.next;
            	current.next = prev;
            	prev = current;
            	current =temp;
            }
            return prev;  //haed of reversed linkedlist
        }
    }

}
