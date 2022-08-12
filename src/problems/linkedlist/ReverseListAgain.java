package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class ReverseListAgain {

	public static void main(String[] args) {
		ListNode head1 = LinkedListHelper.create1To8List();
		LinkedListHelper.display(head1);
		head1 = reverse(head1);
		LinkedListHelper.display(head1);
	}

	private static ListNode reverse(ListNode head1) {
		ListNode curr = head1;
		ListNode prev = null;
		ListNode next = null;
		
		while(curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		return prev;
	}

}
