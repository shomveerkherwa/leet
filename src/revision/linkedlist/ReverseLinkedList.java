package revision.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class ReverseLinkedList {

	public static void main(String[] args) {
		//ListNode head = LinkedListHelper.create1To8List();
		ListNode head = new ListNode(5);
		LinkedListHelper.display(head);
		head = reverse(head);
		LinkedListHelper.display(head);
	}

	private static ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode next = null;
		ListNode curr = head;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

}
