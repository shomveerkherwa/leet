package problems;

import model.ListNode;
import utility.LinkedListHelper;

public class _19_Remove_Nth_Node_From_LinkedList_One_Pass {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To5List();
		int n=5;
		LinkedListHelper.display(head);
		removeNthNodeFromTheEnd(head, n);
		LinkedListHelper.display(head);
	}

	private static ListNode removeNthNodeFromTheEnd(ListNode head, int n) {
		
		ListNode slow = head;
		ListNode fast = head;
		int i=1;
		
		while(i<=n) {
			if(fast != null) {
				fast = fast.next;
			}
			i++;
		}
		
		if(fast != null) {
			while(fast.next != null) {
				fast = fast.next;
				slow = slow.next;
			}
		}
		
		// finally omit the next of slow
		if(slow != null || slow.next != null) {
			slow.next = slow.next.next;
		}
		
		return head;
	}

	

}
