package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode head1  = LinkedListHelper.createCustomeList(new int[] {9,9,9,9,9,9,9});
		ListNode head2 = LinkedListHelper.createCustomeList(new int[] {9,9,9,9});
		head1 = reverse(head1);
		head2 = reverse(head2);
		ListNode head3 = add2Numbers(head1,head2);
		LinkedListHelper.display(head1);
		LinkedListHelper.display(head2);
		LinkedListHelper.display(head3);
	}

	private static ListNode add2Numbers(ListNode head1, ListNode head2) {
		// hoping both the lists will be of same length.
		int carry = 0;
		ListNode head = null;
		ListNode prev = null;
		ListNode cur;
		while(head1 != null || head2 != null || carry != 0) {
			int val1 = head1 != null ? head1.getVal() : 0;
			int val2 = head2 != null ? head2.getVal() : 0;
			int val = val1 + val2 + carry;
			if (val > 9) {
				carry = val / 10;
				val = val % 10;
			} else {
				carry = 0;
			}
			cur = new ListNode(val);
			if(prev != null) {
				prev.next = cur;
			}
			if(head == null) {
				head = cur;
			}
			prev = cur;
			if(head1 != null) head1 = head1.getNext();
			if(head2 != null) head2 = head2.getNext();
		}
		return head;
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
