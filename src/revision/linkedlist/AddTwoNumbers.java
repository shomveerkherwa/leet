package revision.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int [] num1 = {1};
		int [] num2 = {5,6,4};
		ListNode head1 = LinkedListHelper.createCustomeList(num1);
		ListNode head2 = LinkedListHelper.createCustomeList(num2);
		LinkedListHelper.display(head1);
		LinkedListHelper.display(head2);
		LinkedListHelper.display(addTwoNumbers(head1, head2));
	}

	public static ListNode addTwoNumbers(ListNode head1, ListNode head2) {
		ListNode result = null; ListNode head3 = null;
		int carry = 0;
		while(head1 != null || head2 != null || carry != 0) {
			int val1 = head1 == null ? 0 : head1.val;
			int val2 = head2 == null ? 0 : head2.val;
			int sum = val1 + val2 + carry;
			carry = sum / 10;
			int val = sum % 10;
			ListNode node = new ListNode(val);
			
			if(head3 == null) {
				head3 = node;
				result = node;
			} else {
				result.next = node;
				result = node;
			}
			head1 = head1 == null ? null :  head1.next;
			head2 = head2 == null ? null : head2.next;
		}
		return head3;
	}
}
