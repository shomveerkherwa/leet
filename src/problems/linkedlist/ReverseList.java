package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class ReverseList {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To5List();
		LinkedListHelper.display(head);
		head = reverse(head);
		LinkedListHelper.display(head);
	}

	private static ListNode reverse(ListNode head) {
		ListNode current = head;
		ListNode prev = null;
		
		while(current != null) {
			ListNode temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		
		return prev;
	}

}
