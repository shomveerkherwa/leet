package twenty23.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To5List();
		LinkedListHelper.display(head);
		head = solution(head);
		LinkedListHelper.display(head);
	}

	private static ListNode solution(ListNode head) {
		ListNode prev = null;
		ListNode curr = null;
		curr = head;
		
		while(curr != null) {
			head = curr.next;
			curr.next = prev;
			prev = curr;
			curr = head;
		}
		
		return prev;
	}

}
