package revision.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		//int[] inp = {2,2,2,2,3,4,5};
		//int[] inp = {2,2,2,2};
		int[] inp = {1,2,3,3,3,4,4,5};
		ListNode head = LinkedListHelper.createCustomeList(inp);
		LinkedListHelper.display(head);
		head = deleteDuplicates(head);
		LinkedListHelper.display(head);
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode newHead = new ListNode(-1);
		ListNode fast = head;
		ListNode slow = newHead;
		slow.next = fast;
		
		while(fast != null) {
			while(fast.next != null && fast.val == fast.next.val) {
				fast = fast.next;
			}
			if (slow.next != fast) { //duplicates detected.
	    		slow.next = fast.next; //remove the dups.
	    		fast = slow.next;     //reposition the fast pointer.
	    	} else { //no dup, move down both pointer.
	    		slow = slow.next;
	    		fast = fast.next;
	    	}
		}
		return newHead.next;
	}
}
