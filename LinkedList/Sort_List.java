package LinkedList;
//LeetCode - 148 -->


public class Sort_List {
	//given by LeetCode 
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
    class Solution{
    	public ListNode sortList(ListNode head) {
    		//agar single node hi present in that case.
    		if(head==null || head.next == null) {
    			return head;
    		}
    		
    		//dividing list in two parts - one till mid, then other list after mid.
    		ListNode mid =mid(head);
    		ListNode headb =mid.next;
    		mid.next=null;
    		
    		ListNode l1 = sortList(head);
    		ListNode l2 = sortList(headb);
    		
    		return mergeTwoLists(l1,l2);
    		
    	}
    	
    	//ye part mid nikal ke dega
    	//our mid gives second mid for even size list, so if size is 2 it will return second mid that is second node each time and list will not be divided further.Resulting in stack over flow
    	//initially we placed even condition first then odd condition, but remove this error 
    	//we exchange condition, first will come for odd size then even size.
    	public ListNode mid(ListNode head) {
    		ListNode slow = head;
    		ListNode fast = head;
    		while(fast.next!=null && fast.next.next!=null) {
    			slow = slow.next;
    			fast = fast.next.next;
    		}
    		return slow;
    	}
    	
    	//Merging two list -->
    	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(0,null);
            ListNode temp = dummy;
            while(list1 != null && list2 != null) {
            	if(list1.val < list2.val) {
            		dummy.next = list1;
            		dummy = dummy.next;
            		list1 = list1.next;
            	}else {
            		dummy.next = list2;
            		dummy = dummy.next;
            		list2 = list2.next;
            	}
            }
            if(list1==null) {
            	dummy.next = list2;
            }
            if(list2==null) {
            	dummy.next = list1;
            }
            return temp.next;
        }
    }
    
}
